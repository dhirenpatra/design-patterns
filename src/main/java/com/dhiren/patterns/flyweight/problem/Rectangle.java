package com.dhiren.patterns.flyweight.problem;

public class Rectangle implements Shape {

    private int length;
    private int width;
    private String fillStyle;

    public Rectangle() {
    }

    public Rectangle(int radius, int length, int width, String fillStyle) {
        this.length = length;
        this.width = width;
        this.fillStyle = fillStyle;
    }

    @Override
    public void draw() {
        String label = "RECTANGLE";
        System.out.println("Drawing a Rectangle with " + label + " of length " +length+ " and width " + width  +
                " and circle filled with "+fillStyle);
        System.out.println(this.hashCode());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getFillStyle() {
        return fillStyle;
    }

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }
}
