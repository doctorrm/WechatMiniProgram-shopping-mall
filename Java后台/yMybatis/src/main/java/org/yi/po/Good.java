package org.yi.po;

import java.math.BigDecimal;

public class Good {
	Integer goodId;
	String goodName;
	BigDecimal goodPrice;
	String goodMainUrl;
	String goodDetailUrls;
	String goodType;

	public int getGoodId() {
		return goodId;
	}

	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
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

	public String getGoodDetailUrls() {
		return goodDetailUrls;
	}

	public void setGoodDetailUrls(String goodDetailUrls) {
		this.goodDetailUrls = goodDetailUrls;
	}

	public String getGoodType() {
		return goodType;
	}

	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}

	public Good(Integer goodId, String goodName, BigDecimal goodPrice, String goodMainUrl, String goodDetailUrls,
			String goodType) {
		super();
		this.goodId = goodId;
		this.goodName = goodName;
		this.goodPrice = goodPrice;
		this.goodMainUrl = goodMainUrl;
		this.goodDetailUrls = goodDetailUrls;
		this.goodType = goodType;
	}
	
	public Good(String goodName,String goodMainUrl) {
		super();
		this.goodName=goodName;
		this.goodMainUrl=goodMainUrl;
	}

	@Override
	public String toString() {
		return "Good [goodId=" + goodId + ", goodName=" + goodName + ", goodPrice=" + goodPrice + ", goodMainUrl="
				+ goodMainUrl + ", goodDetailUrls=" + goodDetailUrls + ",goodType=" + goodType + "]";
	}

}
