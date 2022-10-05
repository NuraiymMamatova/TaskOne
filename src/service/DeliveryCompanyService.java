package service;

import entities.DeliveryCompany;
import entities.Order;

import java.util.List;

public class DeliveryCompanyService {
    List<DeliveryCompany>deliveryCompanies;

    public void acceptOrder(Order order,int company,int custom){
        if(order.getLoad().getHeight()*order.getLoad().getWidth()<DeliveryCompany.MAX_CAPACITY_PER_SQUARE_SANTIMETER) deliveryCompanies.get(company).getCustomers().get(custom).addOrders(order);
    }
}
