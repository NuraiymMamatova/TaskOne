package entities;

public class Order {
    private double orderFee;
    private Load load;

    public Order(double orderFee, Load load) {
        this.orderFee = orderFee;
        this.load = load;
    }

    public double getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(double orderFee) {
        this.orderFee = orderFee;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }
}
