package org.jugistanbul.part1.cyclomatic;

import java.util.List;

public class Order {

    private String orderId;
    private List<OrderItem> items;
    private String customerName;

    public Order(String orderId, List<OrderItem> items, String customerName) {
        this.orderId = orderId;
        this.items = items;
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
