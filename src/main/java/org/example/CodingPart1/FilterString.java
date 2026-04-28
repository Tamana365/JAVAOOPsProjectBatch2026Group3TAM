package org.example.CodingPart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterString {
    static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");

        List<String> result = new ArrayList<>();

        for (String word : list) {
            if (word.startsWith("A")) {
                result.add(word.toLowerCase());
            }
        }

        System.out.println(result);
    }
    }

