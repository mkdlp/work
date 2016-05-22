package com.lp.cinema.test;


import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class ConnTest {
	@Test
	public void testConn(){
		Connection con=null;
		try {
			InputStream in=Resources.getResourceAsStream("mybatis.xml");
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
			SqlSession session=factory.openSession();
			con=session.getConnection();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull("数据库连接失败..",con);
	}
	
}
