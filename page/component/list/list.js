// page/component/list/list.js
Page({
  data: {
    all_goods: [],
    typeMale: '',
    typeFemale: '',
    typeChildren: '',
  },
  onLoad: function (options) {
    // 页面初始化 options为页面跳转所带来的参数
    this.setData({
      typeMale: options.type_male,
      typeFemale: options.type_female,
      typeChildren: options.type_children,
    })
  },
  onReady: function () {
    // 页面渲染完成
    var self = this;
    wx.request({
      url: 'http://localhost:8080/yMybatis/good/get_all',
      success(res) {
        self.setData({
          all_goods: res.data,
          //new_even:res.data[2].goodName.substr(3,6)//good       
        });
      }
    });
  },
  onShow: function () {
    // 页面显示
  },
  onHide: function () {
    // 页面隐藏
  },
  onUnload: function () {
    // 页面关闭
  }
})