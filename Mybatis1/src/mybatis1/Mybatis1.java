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
		//��ȡ�����ļ�
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//���ݶ�ȡ��������Ϣ����SqlSessionFactory
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//����session
		SqlSession session = sessionFactory.openSession();
		//��ѯһ�������в���һ��ʾUser.xml�ļ���select��ǩ�е�id����������ʾҪ����Ĳ������ڱ�������id
		User user = session.selectOne("test.findUserById", 1);//ǰ������������ռ�
		System.out.println(user);
	} 
	@Test
	public void selectUsersByName() throws IOException{
		//��ȡ�����ļ�
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//���ݶ�ȡ��������Ϣ����SqlSessionFactory
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//����session
		SqlSession session = sessionFactory.openSession();
		//��ѯ���ϣ����в���һ��ʾUser.xml�ļ���select��ǩ�е�id����������ʾҪ����Ĳ������ڱ�������id
		List<User> user = session.selectList("test.findUsersByName", "��");//ǰ������������ռ�
		System.out.println(user);
	} 
}
