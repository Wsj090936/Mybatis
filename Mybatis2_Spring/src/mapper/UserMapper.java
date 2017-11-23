package mapper;

import domain.User;

public interface UserMapper {
	public User findUserById(int id) throws Exception;
}
