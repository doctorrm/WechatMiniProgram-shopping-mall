package org.yi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yi.dao.CategoryOperation;
import org.yi.dao.GoodOperation;
import org.yi.po.Category;
import org.yi.po.FullCategory;
import org.yi.po.Good;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryOperation categoryOperation;
	@Autowired
	GoodOperation goodOperation;

	@RequestMapping(value = "/get_all", produces = "application/json; charset=utf-8", method = { RequestMethod.GET })
	@ResponseBody
	public Object getAll() throws IOException {
		List<Category> results = categoryOperation.getAll();
		List<FullCategory> full_results=new ArrayList<FullCategory>();
		for (Category category : results) {
			List<Good> goods = goodOperation.getByType(category.getCatType());
			FullCategory fullCategory=new FullCategory(category, goods);
			full_results.add(fullCategory);
		}
		ObjectMapper mapper = new ObjectMapper();
		String ret = mapper.writeValueAsString(full_results);
		System.out.println(ret);
		return ret;
	}
}
