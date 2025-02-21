package org.example.pattern.singleton;

public class SingletonLazy {
    private static SingletonLazy INSTANCE;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            return new SingletonLazy();
        }
        return INSTANCE;
    }
}
