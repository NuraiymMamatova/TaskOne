package entities;

import java.util.List;

public class DeliveryCompany {
    private final static double PRICE_PER_KILOGRAM = 20;
    private final static double MAX_CAPACITY_PER_SQUARE_SANTIMETER = 30;
    private String deliveryCompanyName;
    private List<Customer> customers;

    public DeliveryCompany(String deliveryCompanyName, List<Customer> customers) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customers = customers;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
