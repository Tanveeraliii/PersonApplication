package org.example;

public class Order  {
    private int  orderId;
    private String products;

    public Order(int orderId, String products) {
        this.orderId = orderId;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProducts() {
        return products;
    }
    // To Strings


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", products='" + products + '\'' +
                '}';
    }
}
