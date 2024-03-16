package com.dhiren.patterns.facade;

public class OrderProcessor {

    public boolean checkStock(String name, int quantity) {
        System.out.println("Checking Stock");
        return true;
    }

    public Order placeOrder(String name, int quantity) {
        System.out.println("Placing order");
        return new Order(name, quantity);
    }

    public OrderStatus shipOrder(Order order) {
        System.out.println("Shipping DONE");
        return OrderStatus.SHIPPED;
    }

}
