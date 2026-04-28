package org.example.CodingPart1;

public class AlphaCount {
    static void main() {


        //count alphabetic (A–Z, a–z) characters in a string in Java.

        String str = "Hello123 World!";

        String onlyLetters = str.replaceAll("[^a-zA-Z]", ""); // replace everything that is not alphabet with empty
        System.out.println("Alphabetic characters: " + onlyLetters.length());

            }
        }

// SHORTEST FORM;
// int letters = str.replaceAll("[^a-zA-Z]", "").length();