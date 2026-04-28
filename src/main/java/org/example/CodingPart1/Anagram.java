package org.example.CodingPart1;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){


        String  str1 = "listen";
        String  str2 = "silent";

        //converting to char array

        char[] arr1 = str1.toCharArray();// we change the string to char array in order to sort the characters
        char[] arr2 = str2.toCharArray();

        //sorting ascending characters

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //compare two arrays
        if (Arrays.equals(arr1, arr2)) {

            System.out.println("Anagram");

        }else {
            System.out.println("Not Anagram");

        }

    }
}
