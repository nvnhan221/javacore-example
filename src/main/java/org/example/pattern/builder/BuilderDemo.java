package org.example.pattern.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setWheels("4")
                .build();
        car.showCar();
    }
}
