Page({
  data: {
    category: [
      { name: 'T恤', id: 'tixu' },
      { name: '毛衣', id: 'maoyi' },
      { name: '风衣', id: 'fengyi' },
      { name: '西装', id: 'xizhuang' },
      { name: '裤子', id: 'kuzi' },
      { name: '裙子', id: 'qunzi' }
    ],
    detail: [],
    curIndex: 0,
    isScroll: false,
    toView: 'tixu'/*默认定位到哪个view*/
  },


  onReady() {
    var self = this;
    wx.request({
      url: 'http://localhost:8080/yMybatis/category/get_all', success(res) {
        console.log(res.data)
        self.setData({
          detail: res.data
        })
      }
    });
  },
  switchTab(e) {
    const self = this;
    this.setData({
      isScroll: true
    })
    setTimeout(function () {
      self.setData({
        toView: e.target.dataset.id,
        curIndex: e.target.dataset.index
      })
    }, 0)
    setTimeout(function () {
      self.setData({
        isScroll: false
      })
    }, 1)

  }

})