package mapper;

import java.util.List;

import domain.OrdersExt;
import domain.User;

public interface OrdersMapper {
	//resultType��ѯ
	public List<OrdersExt> findOrdersAndUser();
	//resultMap��ѯ
	public List<OrdersExt> findOrdersAndUserMap();
	//һ�Զ�
	public List<OrdersExt> findOrdersAndUserWithDetail();
	//��Զ�
	public List<User> findUserAndInformation();
}
