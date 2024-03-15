package com.dhiren.patterns.decorator;

public class Decorator implements Pizza {

    private Pizza pizza;

    public Decorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void preparePizza() {
        pizza.preparePizza();
    }
}
