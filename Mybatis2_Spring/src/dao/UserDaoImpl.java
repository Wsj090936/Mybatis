package dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import domain.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		return this.getSqlSession().selectOne("test.findUserById", id);
	}

}
