package org.example.CodingPart1;

public class CountWords {
    static void main(String[] args) {

        String str = "Hello, world!";

        int count = countWords(str);
        System.out.println("Number of words: " + count);
    }

    public static int countWords(String str) {

        // remove punctuation and keep only letters and spaces
        str = str.replaceAll("[^a-zA-Z ]", "");

        // split by spaces
        String[] words = str.trim().split("\\s+");

        return words.length;
    }
}
// SHORTEST FORM
// int words = str.trim().split("\\s+").length;