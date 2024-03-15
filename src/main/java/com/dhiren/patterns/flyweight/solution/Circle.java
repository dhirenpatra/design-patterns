package com.dhiren.patterns.flyweight.solution;

public class Circle implements Shape {


    public Circle() {
    }

    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        String label = "CIRCLE";
        System.out.println("Drawing a circle with " + label + " of radius " +radius+ " will line color " +lineColor+
                " and circle filled with "+fillColor);
        System.out.println(this.hashCode());
    }

}
