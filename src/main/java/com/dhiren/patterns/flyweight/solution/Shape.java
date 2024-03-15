package com.dhiren.patterns.flyweight.solution;

public interface Shape {

     default void draw(int radius, String fillColor, String lineColor) {

     }

    default void draw(int length, int width, String fillStyle) {

    }
}
