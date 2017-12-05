package org.yi.po;

import java.math.BigDecimal;

public class Order {
	Integer orderId;
	String goodName;
	BigDecimal goodPrice;
	String goodMainUrl;
	Integer goodNum;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public BigDecimal getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(BigDecimal goodPrice) {
		this.goodPrice = goodPrice;
	}
	public String getGoodMainUrl() {
		return goodMainUrl;
	}
	public void setGoodMainUrl(String goodMainUrl) {
		this.goodMainUrl = goodMainUrl;
	}
	public Integer getGoodNum() {
		return goodNum;
	}
	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
	}
	public Order(Integer orderId, String goodName, BigDecimal goodPrice, String goodMainUrl, Integer goodNum) {
		super();
		this.orderId = orderId;
		this.goodName = goodName;
		this.goodPrice = goodPrice;
		this.goodMainUrl = goodMainUrl;
		this.goodNum = goodNum;
	}
	public Order(String goodName, BigDecimal goodPrice, String goodMainUrl, Integer goodNum) {
		super();
		this.goodName = goodName;
		this.goodPrice = goodPrice;
		this.goodMainUrl = goodMainUrl;
		this.goodNum = goodNum;
	}
}
