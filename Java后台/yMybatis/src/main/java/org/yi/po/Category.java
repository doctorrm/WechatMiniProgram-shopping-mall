package org.yi.po;

import java.util.List;

public class Category {
	Integer catId;
	String catName;
	String catType;
	String catBanner;

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCatType() {
		return catType;
	}

	public void setCatType(String catType) {
		this.catType = catType;
	}

	public String getCatBanner() {
		return catBanner;
	}

	public void setCatBanner(String catBanner) {
		this.catBanner = catBanner;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public Category(Integer catId, String catName, String catType, String catBanner) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.catType = catType;
		this.catBanner = catBanner;
	}

}
