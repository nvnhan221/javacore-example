package org.example.pattern.factory;

public class ShapeFactory {
    public static Shape getShape(String type) {
        Shape shape = null;
        if ("CIRCLE".equalsIgnoreCase(type)) {
            shape = new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            shape = new Rectangle();
        }
        return shape;
    }
}
