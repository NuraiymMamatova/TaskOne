import entities.Customer;
import entities.DeliveryCompany;
import entities.Load;
import entities.Order;
import service.DeliveryCompanyService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Load load = new Load(10.0,5.0,7,1);
        Load load1 = new Load(6.0,7.0,20,1);
        Load load2 = new Load(9.0,4.0,10,1);

        Order order = new Order(load);
        Order order1 = new Order(load1);
        List<Order>orderList=new ArrayList<>();
        orderList.add(order);
        List<Order>orderList2=new ArrayList<>();
        orderList2.add(order1);

        System.out.println(order.getOrderFee());
        System.out.println(order1.getOrderFee());

        Customer customer = new Customer("customer1",orderList);
        Customer customer1 = new Customer("customer2",orderList2);
        customer.addOrders(order1);
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        customer.addOrders(order1);
        customers.add(customer1);
        System.out.println(order1.getOrderFee());

        DeliveryCompany deliveryCompany = new DeliveryCompany("java7");
        deliveryCompany.setCustomers(customers);

        List<DeliveryCompany>deliveryCompanies=new ArrayList<>();
        deliveryCompanies.add(deliveryCompany);
        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService(deliveryCompanies);

        System.out.print("totalFee customer1: ");   System.out.println(deliveryCompanyService.getTotalFee("customer1"));
        System.out.println("all orderfee of java");
        for (DeliveryCompany s:deliveryCompanies) {
            for (Customer c : s.getCustomers()) {
                System.out.println(c.getCustomerName()+" --> "+c.getOrders().stream().map(Order::getOrderFee).reduce(0.0, Double::sum));
            }
        }
        deliveryCompanyService.acceptOrder(order,"java7","c1");
        System.out.print("java7 profit: ");   System.out.println(deliveryCompanyService.getCompanyProfit("java7"));
    }
}
