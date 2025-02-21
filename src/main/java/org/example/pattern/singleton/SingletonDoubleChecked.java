package org.example.pattern.singleton;

public class SingletonDoubleChecked {
    // khai báo 'volatile' để tránh vấn đề instruction reordering (sắp xế lại lệnh trong CPU), giúp đảm bảo thread safety
    private static volatile SingletonDoubleChecked instance;

    private SingletonDoubleChecked() {
        // private contruct để ngăn chặn tạo instance từ bên ngoài.
    }

    public static SingletonDoubleChecked getInstance() {
        if (instance == null) { // tránh lock không cần thiết nếu instance đã được tạo.
            synchronized (SingletonDoubleChecked.class) { // chặn các thread khác
                if (instance == null) { // khi nó chưa tồn tại
                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
}
