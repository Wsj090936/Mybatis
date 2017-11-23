package dao;

import domain.User;

public interface UserDao {
	public User findUserById(int id) throws Exception;
}
