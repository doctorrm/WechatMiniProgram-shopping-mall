Page({
  data: {
    imgUrls: [
      '/image/b1.jpg',
      '/image/b2.jpg',
      '/image/b3.jpg'
    ],
    indicatorDots: false,
    autoplay: false,
    odd_goods: ["nae", "john"],
    even_goods: [],
    title_goods:[],
    new_even: "jjfdsafsdafsdafasf",
    interval: 3000,
    duration: 800,
  },

  onReady() {//获取奇数商品详情    
    this.setData({
      //new_even:this.data.new_even.substr(1,6)
      //new_even: "aabybccddeeffgghhii".substr(3,6)       
    })
    var self = this;
    wx.request({
      url: 'http://localhost:8080/yMybatis/good/get_all_odd',
      success(res) {
        self.setData({
          odd_goods: res.data,
          //new_even:res.data[2].goodName.substr(3,6)//good      
        });
      }
    });
    wx.request({
      url: 'http://localhost:8080/yMybatis/good/get_all_even',
      success(res) {
        self.setData({
          even_goods: res.data,
        });
      },
    });
    wx.request({
      url: 'http://localhost:8080/yMybatis/good/get_title',
      success(res) {
        self.setData({
          title_goods: res.data,
        });
      },
    });
  },

})