package org.example.ZooEcoSystem;

public abstract class Animal implements AnimalBehavior {

    String name;
    int age;


    // Constructor to initialize common properties

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Common implementation: All animals sleep the same way for this simulation
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void eat() {
    }

    public abstract void displayInformation();
}



