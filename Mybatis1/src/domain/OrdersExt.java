package domain;

import java.util.List;

public class OrdersExt extends Orders {
	//向扩展类中添加关联查询的属性名或者属性对象
	private String username;
	private String sex;
	//使用resultMap时添加的属性对象
	private User user;
	//一对多映射添加的集合
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
