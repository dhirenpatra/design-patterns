package com.dhiren.patterns.facade;

public class Customer {
    public static void main(String[] args) {
       OrderFacade facade = new OrderFacade();
       facade.processOrder("Mac Book", 4);
    }
}
