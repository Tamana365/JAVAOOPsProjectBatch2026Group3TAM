package org.example.ZooEcoSystem;

public class Eagle extends Bird {

    public Eagle(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " eats fish and small animals.");
    }

    public void makeSound() {
        System.out.println(name + " screeches.");
    }

    public void displayInformation() {
        System.out.println("Animal Type: Eagle");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}