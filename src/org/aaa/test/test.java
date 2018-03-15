package org.aaa.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.aaa.dao.roleDao;
import org.aaa.pojo.role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class test {
	public static void main(String[] args) throws IOException {
		String resource = "NewFile.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		
		roleDao roleDao = sqlSession.getMapper(roleDao.class);
		
		List<role> list = roleDao.getAll();
		for (role role : list) {
			System.out.println(role);
		}
	}

}
