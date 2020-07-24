package store;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ex43 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Email:");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf.parse(sc.next());

        //Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), new Client(name, email, birthDate), status);

        System.out.print("How many items to this order?:");
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            System.out.printf("Enter #%d item data:\n", i+1);
            System.out.print("Product name:");
            name = sc.nextLine();
            sc.next();
            System.out.print("Product price:");
            double price = sc.nextDouble();
            System.out.print("Quantity:");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(new Product(name, price), price,quantity);

            order.addItem(orderItem);

        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
