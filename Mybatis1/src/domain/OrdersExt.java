package domain;

import java.util.List;

public class OrdersExt extends Orders {
	//����չ������ӹ�����ѯ���������������Զ���
	private String username;
	private String sex;
	//ʹ��resultMapʱ��ӵ����Զ���
	private User user;
	//һ�Զ�ӳ����ӵļ���
	private List<Orderdetail> detailList;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Orderdetail> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<Orderdetail> detailList) {
		this.detailList = detailList;
	}
	
}
