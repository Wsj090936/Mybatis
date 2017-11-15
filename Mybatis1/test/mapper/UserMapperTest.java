package mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import domain.User;
import domain.UserVO;

public class UserMapperTest {
	private SqlSessionFactory sessionFactory;

	@Before
	public void init() throws IOException {
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void testFindUserById() throws Exception {
		SqlSession session = sessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);// 得到Mapper对象
		User user = mapper.findUserById(1);
		System.out.println(user);
		session.close();
	}

	@Test
	public void testfindUserList() throws Exception {
		SqlSession session = sessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);// 得到Mapper对象
		
		UserVO userVO = new UserVO();
		User user = new User();
		user.setUsername("小");
		user.setSex("1");
		userVO.setUser(user);//传入user
		
		List<User> user1 = mapper.findUserList(userVO);
		System.out.println(user1);
		session.close();
	}
	@Test
	public void testfindUserCount() throws Exception {
		SqlSession session = sessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);// 得到Mapper对象
		
		UserVO userVO = new UserVO();
		User user = new User();
		user.setUsername("小");
		user.setSex("1");
		userVO.setUser(user);//传入user
		
		int count = mapper.findUserCount(userVO);
		System.out.println(count);
		session.close();
	}
	@Test
	public void testfindUserMap() throws Exception {
		SqlSession session = sessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);// 得到Mapper对象
	
		User user = mapper.findUserMap(1);
		System.out.println(user);
		session.close();
	}
}
