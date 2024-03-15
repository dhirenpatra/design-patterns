package com.dhiren.patterns.flyweight.problem;

public class PaintApp_WithProblem {

    public void render(int noOfShapes) {
        Shape[] shapes = new Shape[noOfShapes + 1];

        for(int i = 1 ; i <= noOfShapes ; i++) {
            if(i % 2 == 0) {
                shapes[i] = new Circle();
                Circle shape = (Circle) shapes[i];
                shape.setRadius(i);
                shape.setFillColor("Red");
                shape.setLineColor("Black");
                shape.draw();
            } else {
                shapes[i] = new Rectangle();
                Rectangle shape = (Rectangle) shapes[i];
                shape.setLength(i * 2);
                shape.setWidth(i + 4);
                shape.setFillStyle("Black");
                shape.draw();
            }
        }
    }

    public static void main(String[] args) {
        new PaintApp_WithProblem().render(5);
    }

}
