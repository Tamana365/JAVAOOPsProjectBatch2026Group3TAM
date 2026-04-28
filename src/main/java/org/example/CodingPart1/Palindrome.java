package org.example.CodingPart1;

public class Palindrome {
    static void main() {

        String str = "madam";

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        }
    }
}

