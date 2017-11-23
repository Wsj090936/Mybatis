package dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.User;
import mapper.UserMapper;

public class UserDaoTest {
	private ApplicationContext act;
	@Before
	public void init(){
		act = new ClassPathXmlApplicationContext("Spring/applicationContext.xml");
	}
	@Test
	public void test() throws Exception {
		UserDao userDao = (UserDao) act.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(user);
	}
	@Test
	public void testMapper() throws Exception {
		UserMapper mapper = (UserMapper) act.getBean("userMapper");
		User user = mapper.findUserById(1);
		System.out.println(user);
	}

}
