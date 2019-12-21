package com.github.curriculeon;

import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        Character[] temp;

        try {
             temp = new Character[input.length()];
        }catch (NullPointerException e)
        {
            return null;
        }

        int i = 0;
        for (char c : input.toCharArray()) {
            temp[i] = Character.valueOf(input.toCharArray()[i]);
            i++;
        }
        return temp;
    }

    public static Integer[] parseIntegers(String input) {

        int lengthOfArray = 0;
        try {
            for (int i = 0; i < input.length(); i++) {
                try {
                    Integer.valueOf(input.substring(i, (i + 1)));
                } catch (NumberFormatException e) {
                    continue;
                }
                lengthOfArray++;
            }
        }catch (NullPointerException e){return null;}

        Integer [] temp = new Integer[lengthOfArray];

        int j = 0;
        for (int i = 0; i < input.length(); i++) {
            try {
                temp[j] = Integer.valueOf(input.substring(i, (i + 1)));
            } catch (NumberFormatException e) {
                continue;
            }
            j++;
        }
        return temp;
    }

    public static List<String> toList(String[] input) {
        List<String> list = new ArrayList<>();

        for (String s: input)
            list.add(s);

        return list;
    }

    public static String[] parseStrings(String input) {
        String[] temp;
        try {
             temp = new String[input.length()];
        }catch (NullPointerException e){return null;}

        for (int i = 0; i < input.length(); i++)
            temp[i] = input.substring(i, (i+1));

        return temp;
    }
}
