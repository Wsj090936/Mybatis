package dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.User;
/**
 * 传统的方式创建dao
 * @author wushijia
 *
 */
public class UserDaoImpl implements UserDao{
	private SqlSessionFactory sessionFactory;
	public UserDaoImpl(SqlSessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	@Override
	public User findUserById(int id) throws Exception {
		SqlSession session = sessionFactory.openSession();
		User user = session.selectOne("findUserById", id);
		session.close();
		return user;
	}

	@Override
	public List<User> findUsersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
