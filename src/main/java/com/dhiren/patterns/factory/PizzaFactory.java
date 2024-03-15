package com.dhiren.patterns.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        System.out.println(type);
        return switch (type) {
            case "Meat" -> new MeatPizza();
            case "Chicken" -> new ChickenPizza();
            default -> new VegPizza();
        };
    }


}
