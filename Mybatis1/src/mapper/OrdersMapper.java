package mapper;

import java.util.List;

import domain.OrdersExt;

public interface OrdersMapper {
	//resultType��ѯ
	public List<OrdersExt> findOrdersAndUser();
}
