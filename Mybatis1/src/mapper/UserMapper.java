package mapper;

import java.util.List;

import domain.User;

public interface UserMapper {
	// 根据id查找用户
	public User findUserById(int id) throws Exception;

	// 根据姓名模糊查询用户列表
	public List<User> findUsersByName(String name);

	// 插入用户
	public void insertUser(User user);
}
