package com.dhiren.patterns.decorator;

public class Customer {

    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        // pizza.preparePizza();
        new CheesePizzaDecorator(pizza).preparePizza();
    }

}
