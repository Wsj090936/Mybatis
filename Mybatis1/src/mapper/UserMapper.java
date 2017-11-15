package mapper;

import java.util.List;

import domain.User;
import domain.UserVO;

public interface UserMapper {
	// 根据id查找用户
	public User findUserById(int id) throws Exception;

	// 根据姓名模糊查询用户列表
	public List<User> findUsersByName(String name);

	// 插入用户
	public void insertUser(User user);
	
	//查询用户列表
	public List<User> findUserList(UserVO userVO) throws Exception;
	
	//查询用户数量
	public int findUserCount(UserVO userVO) throws Exception;
	//测试resultMap
	public User findUserMap(int id) throws Exception;
}
