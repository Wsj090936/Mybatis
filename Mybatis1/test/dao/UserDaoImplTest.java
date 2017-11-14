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
 * ���Դ�ͳdao�Ĵ���
 * @author wushijia
 *
 */
public class UserDaoImplTest {
	private SqlSessionFactory sessionFactory;
	@Before
	public void init() throws Exception{//����ȡ�����ļ��Ĵ���ŵ��÷����У�ÿ��ִ��Test�µĴ��붼��ִ�и÷���
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
