package domain;

import java.util.List;

public class UserVO {
	//用户信息
	private User user;
	//用户订单
	//用户商品
	//id集合
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
