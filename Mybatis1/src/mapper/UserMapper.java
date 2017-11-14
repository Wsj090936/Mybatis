package mapper;

import java.util.List;

import domain.User;

public interface UserMapper {
	// ����id�����û�
	public User findUserById(int id) throws Exception;

	// ��������ģ����ѯ�û��б�
	public List<User> findUsersByName(String name);

	// �����û�
	public void insertUser(User user);
}
