package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Antonio Perdigoto on 10/01/2019.
 */

public class StringParser {

    public static Character[] parseCharacters(String input) {
        Character[] characters;

        // Creating an array of string length
        characters = new Character[input.length()];

        // Iterate through string
        for (int x = 0; x < input.length(); x++) {
            // Add each character into array
            characters[x] = input.charAt(x);
        }
        return characters;
    }

    public static Integer[] parseIntegers(String input) {
        // Create new empty String array
        input = input.trim();
        Integer[] numbers;
        numbers = new Integer[input.length()];

        // Iterate through the string
        for (int x = 0; x < input.length(); x++) {
            // Add each element into the array
            String temp = input.substring(x, (x+1));
            numbers[x] = parseInt(temp);
        }
        //Return the array
        return numbers;
    }

    public static List<String> toList(String[] input) {
        // Create an empty List
        List<String> list = new ArrayList<String>();

        // Iterate through the string
        for (int x= 0; x < input.length; x++) {
            // Add each element into the list
            list.add(input[x]);
        }

        // Return the List
        return list;

    }

    public static String[] parseStrings(String input) {
        // Create new empty String array
        String[] strings;
        strings = new String[input.length()];

        // Iterate through the string
        for (int x = 0; x < input.length(); x++)
            // Add each element into the array
            strings[x] = input.substring(x, (x+1));

        //Return the array
        return strings;
    }

}



