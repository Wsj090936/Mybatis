package mapper;

import java.util.List;

import domain.User;
import domain.UserVO;

public interface UserMapper {
	// ����id�����û�
	public User findUserById(int id) throws Exception;

	// ��������ģ����ѯ�û��б�
	public List<User> findUsersByName(String name);

	// �����û�
	public void insertUser(User user);
	
	//��ѯ�û��б�
	public List<User> findUserList(UserVO userVO) throws Exception;
	
	//��ѯ�û�����
	public int findUserCount(UserVO userVO) throws Exception;
	//����resultMap
	public User findUserMap(int id) throws Exception;
}
