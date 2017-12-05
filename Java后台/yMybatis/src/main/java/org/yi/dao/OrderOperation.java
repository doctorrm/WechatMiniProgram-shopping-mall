package org.yi.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.yi.po.Cart;
import org.yi.po.Order;

@Component
public class OrderOperation {
	private String getAllStatement = "dao.orderMapper.getAll";
	private String insertStatement = "dao.orderMapper.insert";
	private String deleteStatement="dao.orderMapper.deleteAll";

	public List<Object> getAll() throws IOException {
		OrderOperation orderOperation = new OrderOperation();
		String statement = orderOperation.getAllStatement;
		SqlSession session = orderOperation.getSession();
		List<Object> carts = session.selectList(statement);// 捕获所有对象
		return carts;
	}
	
	public void insert(Order order) {
		OrderOperation orderOperation=new OrderOperation();
		String statement=orderOperation.insertStatement;
		SqlSession session=orderOperation.getSession();
		session.insert(statement, order);
		session.commit();
	}
	public void deleteAll() {
		OrderOperation orderOperation=new OrderOperation();
		String statement=orderOperation.deleteStatement;
		SqlSession session=orderOperation.getSession();
		session.insert(statement);
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
