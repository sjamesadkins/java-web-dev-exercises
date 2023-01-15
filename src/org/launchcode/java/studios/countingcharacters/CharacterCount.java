package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        String movieQuote = "If the product of two terms " +
                "is zero then common sense says at least one " +
                "of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be " +
                "factored allowing that side of the equation to equal " +
                "zero. Once you’ve done that, it’s pretty straightforward " +
                "from there.";
        String line;

//        System.out.println(movieQuote);
//        char[] charactersInMovieQuote = movieQuote.toCharArray();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some text (not too much!)");
        line = input.nextLine().toLowerCase();
        System.out.println(line);


        char[] charactersInLine = line.toCharArray();

        HashMap<Character, Integer> characters = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(alphabet.indexOf(555));

        for (char i : charactersInLine) {
            if (alphabet.indexOf(i) >= 0) {
                if (characters.containsKey(i)) {
                    characters.put(i, characters.get(i) + 1);
                } else {
                    characters.put(i, 1);
                }
            }
        }


        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//        HashMap<Character, Integer> characters = new HashMap<>();
//
//        for (char i : charactersInMovieQuote) {
//            if (characters.containsKey(i)) {
//                characters.put(i, characters.get(i) + 1);
//            } else {
//                characters.put(i, 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//
//
//        }


    }
}
