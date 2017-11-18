package domain;

public class OrdersExt extends Orders {
	//向扩展类中添加关联查询的属性名或者属性对象
	private String username;
	private String sex;
	
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
	
}
