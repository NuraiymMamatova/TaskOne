package entities;

import java.util.ArrayList;
import java.util.List;

public class DeliveryCompany {
    public final static double PRICE_PER_KILOGRAM = 20.0;
    public final static double MAX_CAPACITY_PER_SQUARE_SANTIMETER = 35.0;
    private String deliveryCompanyName;
    private List<Customer> customers = new ArrayList<>();

    public DeliveryCompany(String deliveryCompanyName, List<Customer> customers) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customers = customers;
    }

    public DeliveryCompany(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
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
