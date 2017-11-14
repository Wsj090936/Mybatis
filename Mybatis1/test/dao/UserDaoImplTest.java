package dao;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import domain.User;
/**
 * 测试传统dao的代码
 * @author wushijia
 *
 */
public class UserDaoImplTest {
	private SqlSessionFactory sessionFactory;
	@Before
	public void init() throws Exception{//将读取配置文件的代码放到该方法中，每次执行Test下的代码都会执行该方法
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		UserDao userdao = new UserDaoImpl(sessionFactory);
		User user = userdao.findUserById(1);
		System.out.println(user);
	}

	@Test
	public void testFindUsersByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

}
