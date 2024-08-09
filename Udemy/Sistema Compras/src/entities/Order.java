package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus orderStatus;
    private List<OrderItem> orderItems = new ArrayList<>();
    private Client client;

    public Order(Date moment, OrderStatus orderStatus,Client client) {
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

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }
    public void removeItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double total(){
        double total = 0.0;
        for (OrderItem item: orderItems){
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order moment: " + moment + "\nOrder Status: " + orderStatus + "\n" + client + "\nOrder Items: "
                + orderItems + "\nTotal Price: " + total();
    }
}
