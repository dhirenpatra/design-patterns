package com.dhiren.patterns.factory;

public class DriverClass {
    public static void main(String[] args) {
        PizzaStore pizza = new PizzaStore();
        pizza.orderPizza("Meat");
        System.out.println(pizza);
    }
}
