package dao;

import java.util.List;

import domain.User;

public interface UserDao {
	//����id�����û�
	public User findUserById(int id) throws Exception;
	//��������ģ����ѯ�û��б�
	public List<User> findUsersByName(String name);
	//�����û�
	public void addUser(User user);
}
