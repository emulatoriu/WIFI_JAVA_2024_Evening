package orders.data.logic;

import orders.data.Order;

import java.util.List;

public class OrderService {
    public boolean isThereAnOrderAboveHundret(List<Order> orders) {
        return orders.stream()
                .anyMatch(order -> order.total() > 100);
//        return orders.stream()
//                .filter(order -> order.total() > 100)
//                .findFirst()
//                .get()
//                .orderid();
    }
}
