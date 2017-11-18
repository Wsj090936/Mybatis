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

}
