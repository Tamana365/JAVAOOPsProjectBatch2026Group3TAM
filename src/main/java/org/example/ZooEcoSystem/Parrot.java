package org.example.ZooEcoSystem;

public class Parrot extends Bird {

    public Parrot(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " eats seeds and fruits.");
    }

    public void makeSound() {
        System.out.println(name + " says: Hello!");
    }

    public void displayInformation() {
        System.out.println("Animal Type: Parrot");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}