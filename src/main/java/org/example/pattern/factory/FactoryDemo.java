package org.example.pattern.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        // Provides an interface for creating objects, but allows subclasses to decide which class to instantiate.

        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
