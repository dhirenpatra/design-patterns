package com.dhiren.patterns.flyweight.solution;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    public static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String type) {
        if(shapeMap.get(type) != null)
            return shapeMap.get(type);
        else {
            if("circle".equals(type)) {
                shapeMap.put(type, new Circle());
            } else {
                shapeMap.put(type, new Rectangle());
            }
            return shapeMap.get(type);
        }
    }
}
