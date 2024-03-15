package com.dhiren.patterns.decorator;

public class VeggiePizzaDecorator extends Decorator {
    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void preparePizza() {
        super.preparePizza();
        System.out.println("Adding Veggie Toppings");
    }
}
