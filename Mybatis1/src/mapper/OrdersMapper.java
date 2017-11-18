package mapper;

import java.util.List;

import domain.OrdersExt;

public interface OrdersMapper {
	//resultType��ѯ
	public List<OrdersExt> findOrdersAndUser();
	//resultMap��ѯ
	public List<OrdersExt> findOrdersAndUserMap();
	//һ�Զ�
	public List<OrdersExt> findOrdersAndUserWithDetail();
}
