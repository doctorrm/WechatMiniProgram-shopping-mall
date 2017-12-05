package org.yi.po;

/**
 * 非数据库表，作为中间过渡的订单实体类。
 * 
 * @Author doctorrm
 * @Time 2017-12-04 下午12:28:30
 */
public class OrderInfo {
	/**
	 * 字段迎合了前端发送过来的数据
	 */
	Integer cartId;
	Integer goodId;
	String goodName;
	String goodPrice;
	String goodMainUrl;
	String goodDetailUrls;
	Boolean selected;
	Integer num;

	public Integer getOrderId() {
		return cartId;
	}

	public void setOrderId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getGoodId() {
		return goodId;
	}

	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

	public String getGoodPrice() {
		return goodPrice;
	}

	public void setGoodPrice(String goodPrice) {
		this.goodPrice = goodPrice;
	}

	public String getGoodMainUrl() {
		return goodMainUrl;
	}

	public void setGoodMainUrl(String goodMainUrl) {
		this.goodMainUrl = goodMainUrl;
	}

	public String getGoodDetailUrls() {
		return goodDetailUrls;
	}

	public void setGoodDetailUrls(String goodDetailUrls) {
		this.goodDetailUrls = goodDetailUrls;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public OrderInfo() {// 满足jackson对于空构造器的需求

	}

	public OrderInfo(Integer cartId,Integer goodId,String goodName, String goodPrice, String goodMainUrl,
			String goodDetailUrls,Boolean selected,Integer num) {
		super();
		this.cartId = cartId;
		this.goodId=goodId;
		this.goodName = goodName;
		this.goodPrice = goodPrice;
		this.goodMainUrl = goodMainUrl;
		this.goodDetailUrls = goodDetailUrls;
		this.selected=selected;
		this.num=num;
		
	}

}
