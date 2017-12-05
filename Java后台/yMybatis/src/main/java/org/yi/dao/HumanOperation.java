package org.yi.dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.yi.po.Human;
@Component
public class HumanOperation {
	private String getStatement = "dao.humanMapper.getHuman";
	private String getAllStatement = "dao.humanMapper.getAll";
	private String updateStatement = "dao.humanMapper.updateHuman";
	private String deleteStatement = "dao.humanMapper.deleteHuman";
	private String insertStatement = "dao.humanMapper.insertHuman";

	public static void main(String[] args) throws IOException {

	}

	public  Object getOne(int id) {
		HumanOperation humanOperation = new HumanOperation();
		String statement = humanOperation.getStatement;
		SqlSession session = humanOperation.getSession();
		Object human = session.selectOne(statement,id);
		System.out.println(human);
		return human;
	}

	public  List<Object> getAll() throws IOException {
		HumanOperation humanOperation = new HumanOperation();
		String statement = humanOperation.getAllStatement;
		SqlSession session = humanOperation.getSession();
		List<Object> humans = session.selectList(statement);// 捕获所有对象
		System.out.println(humans);
		return humans;
	}

	public  int update(int id) {
		if (getOne(id) == null) {
			return -1;
		}
		HumanOperation humanOperation = new HumanOperation();
		String statement = humanOperation.updateStatement;
		SqlSession session = humanOperation.getSession();
		int rows = session.update(statement, id);
		session.commit();
		System.out.println(rows);
		if (rows > 0) {
			return rows;
		}
		return 0;
	}

	public  int delete(int id) {
		if (getOne(id) == null) {
			return -1;
		}
		HumanOperation humanOperation = new HumanOperation();
		String statement = humanOperation.deleteStatement;
		SqlSession session = humanOperation.getSession();
		int rows = session.delete(statement, id);
		session.commit();
		System.out.println(rows);
		if (rows > 0) {
			return rows;
		}
		return 0;
	}

	public  int insert() {
		HumanOperation humanOperation = new HumanOperation();
		String statement = humanOperation.insertStatement;
		SqlSession session = humanOperation.getSession();
		int rows = session.insert(statement);
		session.commit();
		if (rows > 0) {
			return rows;
		}
		return 0;
	}

	public SqlSession getSession() {
		String resource = "configuration.xml";
		InputStream is = HumanOperation.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		return session;
	}
}
