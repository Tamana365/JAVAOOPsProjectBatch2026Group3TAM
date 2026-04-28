package org.example.ZooEcoSystem;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " eats bird food.");
    }

    public void makeSound() {
        System.out.println(name + " makes a bird sound.");
    }

    public void displayInformation() {
        System.out.println("Bird Name: " + name);
        System.out.println("bird Age: " + age);
    }
}