package com.github.curriculeon;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        if (input == null){
            return null;
        }
        Character[] charArray = new Character[input.length()];
        for (int i =0; i<input.length();i++){
            charArray[i] = input.charAt(i);
        }
        return  charArray;
    }

    public static Integer[] parseIntegers(String input) {
        if (input == null){return null;}
        input = input.trim();
        Integer[] intArr = new Integer[input.length()];

        for (int i =0; input.length()>i;i++){

            intArr[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
            System.out.println( "this is arr: " +intArr[i]);
        }

        return intArr;
    }

    public static List<String> toList(String[] input) {
        List<String> arr = new ArrayList<String>();
        for (String inpt : input){
            arr.add(inpt);
        }
        return arr;
    }

    public static String[] parseStrings(String input) {
        if (input == null) return null;
        String[] arr =  input.split("");
        return arr;
    }

}
