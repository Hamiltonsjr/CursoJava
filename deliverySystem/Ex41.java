package deliverySystem;

import java.util.Date;

public class Ex41 {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        // converção de String para enum
        // normalmente o usuário vai entrar de forma de String

        System.out.println(os1);
        System.out.println(os2);


    }
}
