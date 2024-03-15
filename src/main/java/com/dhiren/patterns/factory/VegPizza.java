package com.dhiren.patterns.factory;

public class VegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing VegPizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking VegPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting VegPizza");
    }
}
