package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input)
    {
        Character[] charArray= new Character[input.length()];
            for (int i=0;i<input.length();i++) {
                charArray[i] = input.charAt(i);
            }
            return charArray;
    }

    public static Integer[] parseIntegers(String input)
    {
        String trimmedString = input.trim();
        if (trimmedString.length() > 0 ) {
            String[] splitInput = parseStrings(trimmedString);
            Integer[]  intArray = new Integer[splitInput.length];
            System.out.println(splitInput.length);
            for(int i=0;i<splitInput.length;i++) {
                intArray[i] = Integer.parseInt(splitInput[i]);
            }
            return intArray;
        } else {
            return new Integer[0];
        }
    }

    public static List<String> toList(String[] input) {
        List<String> list = new ArrayList<>();
        for (String s : input) {
            list.add(s);
        }
        return list;
    }

    public static String[] parseStrings(String input) {
        String[] parsedString = input.split("");
        return parsedString;
    }
}
