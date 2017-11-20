package mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import domain.OrdersExt;
import domain.User;

public class OrdersMapperTest {
	private SqlSessionFactory sessionFactory;
	@Before
	public void init() throws IOException{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testFindOrdersAndUser() {
		SqlSession session = sessionFactory.openSession();
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		List<OrdersExt> list = mapper.findOrdersAndUser();
		session.close();
	}
	@Test
	public void testFindOrdersAndUserMap() {
		SqlSession session = sessionFactory.openSession();
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		List<OrdersExt> list = mapper.findOrdersAndUserMap();
		session.close();
	}
	@Test
	public void testFindOrdersAndUserWithDetailMap() {
		SqlSession session = sessionFactory.openSession();
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		List<OrdersExt> list = mapper.findOrdersAndUserWithDetail();
		session.close();
	}
	@Test
	public void testFindUserAndInformation() {
		SqlSession session = sessionFactory.openSession();
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		List<User> list = mapper.findUserAndInformation();
		session.close();
	}
	@Test
	public void testLazyLoading() {
		SqlSession session = sessionFactory.openSession();
		OrdersMapper mapper = session.getMapper(OrdersMapper.class);
		List<OrdersExt> list = mapper.findOrdersAndUserByLazyLoading();
		for (OrdersExt order : list) {
			System.out.println(order.getUser());
		}
		session.close();
	}
	@Test
	public void levelOneCache() throws Exception{
		SqlSession session = sessionFactory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = mapper.findUserById(1);
		System.out.println(user);
		User user2 = mapper.findUserById(1);
		System.out.println(user2);
	}
	
}
