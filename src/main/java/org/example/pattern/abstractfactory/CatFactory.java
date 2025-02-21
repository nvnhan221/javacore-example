package org.example.pattern.abstractfactory;

public class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Cat();
    }
}
