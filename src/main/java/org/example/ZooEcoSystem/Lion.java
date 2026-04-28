package org.example.ZooEcoSystem;

import org.example.ZooEcoSystem.Mammal;

public class Lion extends Mammal {

    public Lion(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " eats meat.");
    }

    public void makeSound() {
        System.out.println(name + " roars.");
    }

    public void displayInformation() {
        System.out.println("Animal Type: Lion");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}