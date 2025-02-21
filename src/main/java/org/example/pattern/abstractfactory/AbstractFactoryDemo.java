package org.example.pattern.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Creates families of related objects without specifying their concrete classes.

        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.makeSound();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.makeSound();
    }
}
