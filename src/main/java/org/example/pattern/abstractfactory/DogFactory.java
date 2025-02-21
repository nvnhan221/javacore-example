package org.example.pattern.abstractfactory;

public class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Dog();
    }
}
