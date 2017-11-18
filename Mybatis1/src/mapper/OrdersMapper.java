package mapper;

import java.util.List;

import domain.OrdersExt;

public interface OrdersMapper {
	//resultType≤È—Ø
	public List<OrdersExt> findOrdersAndUser();
}
