package org.example.CodingPart1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    static void main(String[] args) {
        String str = "abracadabra";

        char result = firstNonRepeating(str);

        System.out.println("First non-repeating character: " + result);
    }

    public static char firstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '_';
    }
}