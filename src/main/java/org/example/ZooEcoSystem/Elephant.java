package org.example.ZooEcoSystem;

import org.example.ZooEcoSystem.Mammal;

public class Elephant extends Mammal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " eats grass and fruits.");
    }

    public void makeSound() {
        System.out.println(name + " trumpets.");
    }

    public void displayInformation() {
        System.out.println("Animal Type: Elephant");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}