package domain;

import java.util.List;

public class UserVO {
	//�û���Ϣ
	private User user;
	//�û�����
	//�û���Ʒ
	//id����
	private List<Integer> idList;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
	
}
