package org.example.ZooEcoSystem;

import org.example.ZooEcoSystem.Animal;

public class Mammal extends Animal {

    public Mammal(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " eats mammal food.");
    }

    public void makeSound() {

        System.out.println(name + " makes a mammal sound.");
    }

    public void displayInformation() {
        System.out.println("Mammal Name: " + name);
        System.out.println("Age: " + age);
    }
}

