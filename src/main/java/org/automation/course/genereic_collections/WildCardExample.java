package org.automation.course.genereic_collections;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

    static class Animal {
        void speak() {
            System.out.println("Animal sound...");
        }
    }

    static class Dog extends Animal {
        private final String name;

        public Dog(String name) {
            this.name = name;
        }

        void speak() {
            System.out.printf("Bark! %s is a good boy!%n", name);
        }
    }

    static class Duck  {
        private final String name;

        Duck(String name) {
            this.name = name;
        }

        void speak() {
            System.out.printf("Quack! %s is a loud duck!%n", name);
        }
    }

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Archie"));
        dogs.add(new Dog("Pirate"));

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Donald"));
        ducks.add(new Duck("Daisy"));
        printAnimals(dogs);
        //не скомпилируется
//        printAnimals(ducks);
    }
}
