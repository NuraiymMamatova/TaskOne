package service;

import entities.Customer;
import entities.DeliveryCompany;
import entities.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeliveryCompanyService {
    List<DeliveryCompany>deliveryCompanies = new ArrayList<>();
    public DeliveryCompanyService(List<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    public void acceptOrder(Order order, String companyname, String customername) {
        if (order.getLoad().getLength() * order.getLoad().getHeight() * order.getLoad().getWidth() < DeliveryCompany.MAX_CAPACITY_PER_SQUARE_SANTIMETER) {
            for (DeliveryCompany d : deliveryCompanies) {
                if (d.getDeliveryCompanyName().equals(companyname)) {
                    for (Customer c : d.getCustomers()) {
                        if (c.getCustomerName().equals(customername)) {
                            c.addOrders(order);
                        }
                    }
                }
            }
        }
    }
    public void createDeliveryCompany() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the company name: ");
        deliveryCompanies.add(new DeliveryCompany(scanner.nextLine()));
    }

    public double getTotalFee(String name) {
        double f = 0;
        for (DeliveryCompany d : deliveryCompanies) {
            for (Customer customer : d.getCustomers()) {
                if (name.equals(customer.getCustomerName())) {
                    f = customer.getOrders().stream().map(Order::getOrderFee).reduce(0.0, Double::sum);
                }
            }
        }
        return f;
    }


    public double getCompanyProfit(String company) {
        double d = 0.0;
        for (DeliveryCompany deliveryCompany : deliveryCompanies) {
            if (company.equals(deliveryCompany.getDeliveryCompanyName())) {
                for (Customer customer : deliveryCompany.getCustomers()) {
                    d += customer.getOrders().stream().map(c -> c.getOrderFee()).reduce(0.0, Double::sum);
                }
            }
        }
        return d;
    }

}
