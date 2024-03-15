package com.dhiren.patterns.decorator;

public class CheesePizzaDecorator extends Decorator {
    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void preparePizza() {
        super.preparePizza();
        System.out.println("Adding Cheese Toppings");
    }
}
