package org.example.pattern.singleton;

import javax.management.InstanceAlreadyExistsException;

public enum SingletonEnum {
    INSTANCE;

    public void showMessage() {
        System.out.println("Hello from SingletonEnum!");
    }
}
