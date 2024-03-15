package com.dhiren.patterns.flyweight.solution;

public class Rectangle implements Shape {

    public Rectangle() {
    }

    @Override
    public void draw(int length, int width, String fillStyle) {
        String label = "RECTANGLE";
        System.out.println("Drawing a Rectangle with " + label + " of length " +length+ " and width " + width  +
                " and circle filled with "+fillStyle);
        System.out.println(this.hashCode());
    }

}
