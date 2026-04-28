package org.example.CodingPart1;

import java.util.*;

public class RemoveDuplicatesFromArrays {
    static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("A", "B", "A", "C", "B")
        );

        Set<String> set = new LinkedHashSet<>(list);

        ArrayList<String> result = new ArrayList<>(set);

        System.out.println(result);
    }
}