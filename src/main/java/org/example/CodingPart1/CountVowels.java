package org.example.CodingPart1;

public class CountVowels {
    static void main(String[] args) {

        String word = "documentation";

        int result = countVowels(word);
        System.out.println("Number of vowels: " + result);
    }

    public static int countVowels(String str) {
        int count = 0;

        str = str.toLowerCase(); // handle uppercase too

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
// SHORTEST FORM OF CHECKING VOWELS;

// int vowels = str.replaceAll("[^aeiouAEIOU]", "").length();


