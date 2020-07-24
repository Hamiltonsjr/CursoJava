package store;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private List<OrderItem> items = new ArrayList<>();

    private Date moment;
    private OrderStatus orderStatus;
    private Client client;

    public Order(){

    }
    /*
        Esse é construtor padrão para criar um pedido.
        @param moment data do pedido.
        @param Client cliente do pedido.
        @param OrderStatus Status do pedido.
     */
    public Order(Date moment, Client client, OrderStatus orderStatus) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0;
        for (OrderItem item: items) {
            sum += item.subTotal();

        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(orderStatus + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order Itens:\n");
        for (OrderItem item: items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();


    }



}
