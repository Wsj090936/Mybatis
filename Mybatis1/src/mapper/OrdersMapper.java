package mapper;

import java.util.List;

import domain.OrdersExt;

public interface OrdersMapper {
	//resultType查询
	public List<OrdersExt> findOrdersAndUser();
	//resultMap查询
	public List<OrdersExt> findOrdersAndUserMap();
	//一对多
	public List<OrdersExt> findOrdersAndUserWithDetail();
}
