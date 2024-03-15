package com.dhiren.patterns.decorator;

public class PlainPizza implements  Pizza {
    @Override
    public void preparePizza() {
        System.out.println("Baking Basic Pizza");
    }

}
