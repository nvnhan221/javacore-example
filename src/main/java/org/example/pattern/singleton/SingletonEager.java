package org.example.pattern.singleton;

public class SingletonEager {

    // Tạo instance ngay khi class được load
    private static SingletonEager INSTANCE = new SingletonEager();


    // private constructor để ngăn tạo instance từ bên ngoài.
    private SingletonEager() {}

    // trả về instance duy nhất.
    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
