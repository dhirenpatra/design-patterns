package com.dhiren.patterns.flyweight.problem;

public class Circle implements Shape {

    private int radius;
    private String fillColor;
    private String lineColor;

    public Circle() {
    }

    public Circle(int radius, String fillColor, String lineColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
    }

    @Override
    public void draw() {
        String label = "CIRCLE";
        System.out.println("Drawing a circle with " + label + " of radius " +radius+ " will line color " +lineColor+
                " and circle filled with "+fillColor);
        System.out.println(this.hashCode());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }
}
