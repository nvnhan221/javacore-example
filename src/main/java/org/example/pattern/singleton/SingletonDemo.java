package org.example.pattern.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        // Singleton Pattern
        // Ensures that a class has only one instance and provides a global access point to it.
        Singleton obj = Singleton.getInstance();
        obj.showMessage();
    }
}
