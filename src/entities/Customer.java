package entities;

import java.util.List;

public class Customer {
    private String customerName;
    private List<Order> orders;

    public Customer(String customerName, List<Order> orders) {
        this.customerName = customerName;
        this.orders = orders;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order order) {
        orders.add(order);
    }
}