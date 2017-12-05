// page/component/orders/orders.js
Page({
  data: {
    address: {},
    hasAddress: false,
    total: 0,
    orders: [],
    ma: "happy"
  },

  //从服务器获取订单数据,onShow比onReady先执行
  onLoad() {
    var self=this;
    setTimeout(function () {//用延迟执行的方式避免因为事务冲突得到刚刚删除空的数据库而得不到数据
      wx.request({
        url: 'http://localhost:8080/yMybatis/order/get_all',
        success(res) {          
          console.log(self.data.ma)
          console.log(res.data)
          self.setData({
            orders: res.data
          })
          self.getTotalPrice();
        }
      });
    }, 2000)
  },

  onShow: function () {
    const self = this;
    wx.getStorage({
      key: 'address',
      success(res) {
        self.setData({
          address: res.data,
          hasAddress: true
        })
      }
    });
  },

  /**
   * 计算总价
   */
  getTotalPrice() {
    let orders = this.data.orders;
    let total = 0;
    for (let i = 0; i < orders.length; i++) {
      total += orders[i].goodNum * orders[i].goodPrice;
    }
    console.log("金额" + total)
    this.setData({
      total: total
    })
  },

  toPay() {
    wx.showModal({
      title: '提示',
      content: '本系统只做演示，支付系统已屏蔽',
      text: 'center',
      complete() {
        wx.switchTab({
          url: '/page/component/user/user'
        })
      }
    })
  }
})