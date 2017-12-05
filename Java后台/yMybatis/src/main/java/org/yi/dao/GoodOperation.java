package org.yi.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.yi.po.Good;

@Component
public class GoodOperation {
	private String getStatement = "dao.goodMapper.getGood";
	private String getAllStatement = "dao.goodMapper.getAll";
	private String getAllOddStatement = "dao.goodMapper.getAllOdd";// 奇数
	private String getAllEvenStatement = "dao.goodMapper.getAllEven";// 偶数
	private String getByTypeStatement = "dao.goodMapper.getByType";
	private String getTitleStatement = "dao.goodMapper.getTitle";

	public Object getOne(int id) {
		GoodOperation goodOperation = new GoodOperation();
		String statement = goodOperation.getStatement;
		SqlSession session = goodOperation.getSession();
		Object good = session.selectOne(statement, id);
		System.out.println(good);
		return good;
	}

	public List<Object> getAll() throws IOException {
		GoodOperation goodOperation = new GoodOperation();
		String statement = goodOperation.getAllStatement;
		SqlSession session = goodOperation.getSession();
		List<Object> goods = session.selectList(statement);// 捕获所有对象
		System.out.println(goods);
		return goods;
	}

	public List<Object> getAllOdd() throws IOException {
		GoodOperation goodOperation = new GoodOperation();
		String statement = goodOperation.getAllOddStatement;
		SqlSession session = goodOperation.getSession();
		List<Object> goods = session.selectList(statement);// 捕获所有对象
		System.out.println(goods);
		return goods;
	}

	public List<Object> getAllEven() throws IOException {
		GoodOperation goodOperation = new GoodOperation();
		String statement = goodOperation.getAllEvenStatement;
		SqlSession session = goodOperation.getSession();
		List<Object> goods = session.selectList(statement);// 捕获所有对象
		System.out.println(goods);
		return goods;
	}

	public List<Good> getByType(String goodType) {
		GoodOperation goodOperation = new GoodOperation();
		String statement = goodOperation.getByTypeStatement;
		SqlSession session = goodOperation.getSession();
		List<Good> goods = session.selectList(statement, goodType);
		return goods;
	}

	//首页滑窗商品
	public List<Good> getTitle() {
		GoodOperation goodOperation = new GoodOperation();
		String statement = goodOperation.getTitleStatement;
		SqlSession session = goodOperation.getSession();
		List<Good> goods = session.selectList(statement);
		return goods;
	}

	public SqlSession getSession() {
		String resource = "configuration.xml";
		InputStream is = GoodOperation.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		return session;
	}
}
