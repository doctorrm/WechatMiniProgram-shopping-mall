// page/component/new-pages/cart/cart.js
Page({
  data: {
    carts: [],               // 购物车列表
    hasList: false,          // 列表是否有数据
    totalPrice: 0,           // 总价，初始为0
    selectAllStatus: true,    // 全选状态，默认全选
    obj: {
      name: "hello"
    },
    model: '',
    orders: ["oordd"],
  },

  onShow() {//网络请求从数据库中获取购物车信息,比onReady先执行，实时显示购物车状态   
    var self = this;
    wx.request({
      url: 'http://localhost:8080/yMybatis/cart/get_all',
      success(res) {
        //console.log(res.data);
        self.setData({
          carts: res.data,
          //new_even:res.data[2].goodName.substr(3,6)//good  
        });
      }
    });
    this.setData({
      hasList: true,
    });
  },

  test() {
    let carts = this.data.carts;                  // 获取购物车列表
    let total = 0;
    let temp = [];
    for (let i = 0; i < carts.length; i++) {         // 循环列表得到每个数据
      if (carts[i].selected) {                     // 判断是否选中
        temp.push(carts[i])
      }
    }
    //console.log("temp:"+temp)
    this.setData({
      orders: temp
    });
    var order_info = JSON.stringify(this.data.orders)
    //console.log(order_info)
    //将选中的数据发往后台数据库，数据量大，用POST，迟早要做，目前不会
    var self = this;
    wx.request({
      url: 'http://localhost:8080/yMybatis/good/order',
      header: {
        "Content-Type": "application/json;charset=utf-8",       
      },  
      method:"POST",
      data: "{'json':'"+order_info+"'}",//不要用双引号，后台会错，暂时解决不了
    });
    //console.log("LOOKHERE:"+this.data.orders[1].goodName)//重要！！！！注意和上面直接order的区别（有this.setData在牵头）
  },

  /**
   * 当前商品选中事件
   */
  selectList(e) {
    const index = e.currentTarget.dataset.index;
    let carts = this.data.carts;
    const selected = carts[index].selected;
    carts[index].selected = !selected;
    this.setData({
      carts: carts
    });
    this.getTotalPrice();
  },

  /**
   * 删除购物车当前商品
   */
  deleteList(e) {
    const index = e.currentTarget.dataset.index;
    let carts = this.data.carts;
    carts.splice(index, 1);
    this.setData({
      carts: carts
    });
    if (!carts.length) {
      this.setData({
        hasList: false
      });
    } else {
      this.getTotalPrice();
    }
  },

  /**
   * 购物车全选事件
   */
  selectAll(e) {
    let selectAllStatus = this.data.selectAllStatus;
    selectAllStatus = !selectAllStatus;
    let carts = this.data.carts;

    for (let i = 0; i < carts.length; i++) {
      carts[i].selected = selectAllStatus;
    }
    this.setData({
      selectAllStatus: selectAllStatus,
      carts: carts
    });
    this.getTotalPrice();
  },

  /**
   * 绑定加数量事件
   */
  addCount(e) {
    const index = e.currentTarget.dataset.index;
    let carts = this.data.carts;
    let num = carts[index].num;
    num = num + 1;
    carts[index].num = num;
    this.setData({
      carts: carts
    });
    this.getTotalPrice();
  },

  /**
   * 绑定减数量事件
   */
  minusCount(e) {
    const index = e.currentTarget.dataset.index;
    const obj = e.currentTarget.dataset.obj;
    let carts = this.data.carts;
    let num = carts[index].num;
    if (num <= 1) {
      return false;
    }
    num = num - 1;
    carts[index].num = num;
    this.setData({
      carts: carts
    });
    this.getTotalPrice();
  },

  /**
   * 计算总价
   */
  getTotalPrice() {
    let carts = this.data.carts;                  // 获取购物车列表
    let total = 0;
    for (let i = 0; i < carts.length; i++) {         // 循环列表得到每个数据
      if (carts[i].selected) {                     // 判断选中才会计算价格
        total += carts[i].num * carts[i].goodPrice;   // 所有价格加起来
      }
    }
    this.setData({                                // 最后赋值到data中渲染到页面
      carts: carts,
      totalPrice: total.toFixed(2)
    });
  }

})