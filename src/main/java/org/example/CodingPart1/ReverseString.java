package org.example.CodingPart1;

public class ReverseString {
    static void main() {

        String str = "Hello";

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed: " + reversed);

    }
}
