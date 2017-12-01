Page({
  data: {
    imgUrls: [
      '/image/b1.jpg',
      '/image/b2.jpg',
      '/image/b3.jpg'
    ],
    indicatorDots: false,
    autoplay: false,
    goods:[],
    interval: 3000,
    duration: 800,
  },

  onReady() {//获取详情
    var self = this;
    wx.request({
      url: 'http://localhost:8080/yMybatis/good/get_all',
      success(res) {
        console.log(res.data);
        self.setData({
          goods: res.data,

        });

      }
    });
    

  }

})