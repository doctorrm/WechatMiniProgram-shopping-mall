// page/component/details/details.js
Page({
  data: {
    goods: {
      id: 1,
      image: '/image/goods1.png',
      title: '新鲜梨花带雨',
      price: 0.01,
      //detail: '这里是梨花带雨详情。',
      detail: "http://127.0.0.1:8080/images/b1.jpg",
      parameter: '125g/个',
      service: '不支持退货',
      model: 'good'
    },
    num: 1,
    pics: [],
    tests: [],
    main_pic:'',
    totalNum: 0,
    hasCarts: false,
    curIndex: 0,
    show: false,
    scaleCart: false
  },


  // onReady() {//获取详情
  //   var self = this;
  //   wx.request({
  //     url: 'http://localhost:8080/yMybatis/good/get_all',
  //     success(res) {
  //       //console.log(res.data);
  //       for (let i = 0; i < res.data.length; i++) {
  //         console.log("success!!!")
  //         // var te=new te[res.data.length]
  //         // console.log(te.length)        
  //       };
  //       self.setData({
  //         pics: res.data,
  //       });

  //     }
  //   });
  // },

  //获取从首页穿过来的数据
  onLoad: function (options) {
    var bean = options.model - 1;

    this.setData({
      model: bean,
      tests: options.urls.split(','),
      main_pic:options.main_pic
    })
  },

  addCount() {
    let num = this.data.num;
    num++;
    this.setData({
      num: num
    })
  },

  addToCart() {
    const self = this;
    const num = this.data.num;
    let total = this.data.totalNum;

    self.setData({
      show: true
    })
    setTimeout(function () {
      self.setData({
        show: false,
        scaleCart: true
      })
      setTimeout(function () {
        self.setData({
          scaleCart: false,
          hasCarts: true,
          totalNum: num + total
        })
      }, 200)
    }, 300)

  },

  bindTap(e) {
    const index = parseInt(e.currentTarget.dataset.index);
    this.setData({
      curIndex: index
    })
  }

})