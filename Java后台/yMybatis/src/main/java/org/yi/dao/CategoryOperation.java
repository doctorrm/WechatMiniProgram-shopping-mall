package org.yi.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.yi.po.Cart;
import org.yi.po.Category;
@Component
public class CategoryOperation {
	private String getAllStatement = "dao.categoryMapper.getAll";


	public List<Category> getAll() throws IOException {
		CategoryOperation categoryOperation = new CategoryOperation();
		String statement = categoryOperation.getAllStatement;
		SqlSession session = categoryOperation.getSession();
		List<Category> categories = session.selectList(statement);// 捕获所有对象
		return categories;
	}
	

	public SqlSession getSession() {
		String resource = "configuration.xml";
		InputStream is = GoodOperation.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		return session;
	}
}
