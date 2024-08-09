import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(101, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1 +" " +os2);
    }
}