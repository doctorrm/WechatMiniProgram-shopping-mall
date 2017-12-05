// page/component/new-pages/user/user.js
Page({
  data: {
    thumb: '',
    nickname: '',
    orders: [],
    hasAddress: false,
    address: {}
  },

  //（待做：自动刷新）
  onLoad() {
    var self = this;
    /**
     * 获取用户信息
     */
    wx.getUserInfo({
      success: function (res) {
        self.setData({
          thumb: res.userInfo.avatarUrl,
          nickname: res.userInfo.nickName
        })
      }
    }),

      /**
       * 发起请求获取订单列表信息（待做：自动刷新）
       */
      setTimeout(function () {//用延迟执行的方式避免因为事务冲突得到刚刚删除空的数据库而得不到数据
        wx.request({
          url: 'http://localhost:8080/yMybatis/order/get_all',
          success(res) {
            console.log(res.data)
            self.setData({
              orders: res.data
            })
          }
        });
      }, 1000)
  },
  onShow() {
    var self = this;
    /**
     * 获取本地缓存 地址信息
     */
    wx.getStorage({
      key: 'address',
      success: function (res) {
        self.setData({
          hasAddress: true,
          address: res.data
        })
      }
    })
  },
  /**
   * 发起支付请求
   */
  payOrders() {
    wx.requestPayment({
      timeStamp: 'String1',
      nonceStr: 'String2',
      package: 'String3',
      signType: 'MD5',
      paySign: 'String4',
      success: function (res) {
        console.log(res)
      },
      fail: function (res) {
        wx.showModal({
          title: '支付提示',
          content: '<text>',
          showCancel: false
        })
      }
    })
  }
})