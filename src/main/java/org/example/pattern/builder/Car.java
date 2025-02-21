package org.example.pattern.builder;

public class Car {
    private String engine;
    private String wheels;

    public Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
    }

    public static class CarBuilder {
        private String engine;
        private String wheels;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    public void showCar() {
        System.out.println("Car with Engine: " + engine + ", Wheels:" + wheels);
    }
}
