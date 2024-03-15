package com.dhiren.patterns.flyweight.solution;



public class PaintApp {

    public void render(int noOfShapes) {
        Shape shape;

        for(int i = 1; i <= noOfShapes ; i++) {
            if(i % 2 == 0) {
                shape = ShapeFactory.getShape("circle");
                shape.draw(i, "Red", "White");
            } else {
                shape = ShapeFactory.getShape("rectangle");
                shape.draw(i, i + i , "RED");
            }
        }

    }

    public static void main(String[] args) {
        new PaintApp().render(5);
    }

}
