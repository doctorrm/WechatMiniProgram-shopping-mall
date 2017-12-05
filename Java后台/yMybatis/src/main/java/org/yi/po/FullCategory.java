package org.yi.po;

import java.util.List;

public class FullCategory {
	Category dbCategory;
	List<Good> dbGoods;

	public Category getDbCategory() {
		return dbCategory;
	}

	public void setDbCategory(Category dbCategory) {
		this.dbCategory = dbCategory;
	}

	public List<Good> getDbGoods() {
		return dbGoods;
	}

	public void setDbGoods(List<Good> dbGoods) {
		this.dbGoods = dbGoods;
	}

	public FullCategory(Category dbCategory, List<Good> dbGoods) {
		super();
		this.dbCategory = dbCategory;
		this.dbGoods = dbGoods;
	}

}
