package org.example.CodingPart1;

public class SwapString {

    static void main() {

        String a = "Hello";
        String b = "World";

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Step 1: Combine
        a = a + b;   // "HelloWorld"

        // Step 2: Get original 'a'
        b = a.substring(0, a.length() - b.length()); // "Hello"

        // Step 3: Get original 'b'
        a = a.substring(b.length()); // "World"

        System.out.println("\nAfter swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
