package org.example;

import org.example.ZooEcoSystem.*;

public class ZooTest {

    public static void main(String[] args) {

        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal parrot = new Parrot("Polly", 2);
        Animal eagle = new Eagle("Sky", 4);

        lion.displayInformation();
        lion.eat();
        lion.sleep();
        lion.makeSound();

        System.out.println();

        elephant.displayInformation();
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();

        System.out.println();

        parrot.displayInformation();
        parrot.eat();
        parrot.sleep();
        parrot.makeSound();

        System.out.println();

        eagle.displayInformation();
        eagle.eat();
        eagle.sleep();
        eagle.makeSound();
    }
}
