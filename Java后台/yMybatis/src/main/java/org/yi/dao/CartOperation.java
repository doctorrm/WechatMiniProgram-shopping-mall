package org.yi.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.yi.po.Cart;
@Component
public class CartOperation {
	private String getAllStatement = "dao.cartMapper.getAll";
	private String insertStatement = "dao.cartMapper.insert";


	public List<Object> getAll() throws IOException {
		CartOperation cartOperation = new CartOperation();
		String statement = cartOperation.getAllStatement;
		SqlSession session = cartOperation.getSession();
		List<Object> carts = session.selectList(statement);// 捕获所有对象
		return carts;
	}
	
	public void insert(Cart cart) {
		CartOperation cartOperation=new CartOperation();
		String statement=cartOperation.insertStatement;
		SqlSession session=cartOperation.getSession();
		session.insert(statement, cart);
		session.commit();
	}
	
	public SqlSession getSession() {
		String resource = "configuration.xml";
		InputStream is = GoodOperation.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		return session;
	}
}
