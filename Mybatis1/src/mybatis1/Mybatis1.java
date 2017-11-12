package mybatis1;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import domain.User;

public class Mybatis1 {
	@Test
	public void selectUserById() throws IOException{
		//读取配置文件
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//根据读取道到的信息创建SqlSessionFactory
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建session
		SqlSession session = sessionFactory.openSession();
		//查询一个，其中参数一表示User.xml文件中select标签中的id，参数二表示要传入的参数，在本例中是id
		User user = session.selectOne("test.findUserById", 1);//前面加上了命名空间
		System.out.println(user);
	} 
	@Test
	public void selectUsersByName() throws IOException{
		//读取配置文件
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//根据读取道到的信息创建SqlSessionFactory
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建session
		SqlSession session = sessionFactory.openSession();
		//查询集合，其中参数一表示User.xml文件中select标签中的id，参数二表示要传入的参数，在本例中是id
		List<User> user = session.selectList("test.findUsersByName", "五");//前面加上了命名空间
		System.out.println(user);
	} 
}
