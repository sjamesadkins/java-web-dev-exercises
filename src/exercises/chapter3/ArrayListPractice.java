package exercises.chapter3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);
        numbers.add(1000);
        numbers.add(5001);
        numbers.add(51);
        System.out.println(numbers);
        System.out.println(sumEven(numbers));

        ArrayList<String> fiveLetters = new ArrayList<>();
        fiveLetters.add("nice");
        fiveLetters.add("day");
        fiveLetters.add("baked");
        fiveLetters.add("sunny");
        fiveLetters.add("for");
        fiveLetters.add("white");
        fiveLetters.add("wedding");
        fiveLetters.add("paper");
        System.out.println(fiveLetters);
        numLetters(fiveLetters);

        String text = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

//        Split text into ArrayList
        String[] str = text.split(" ");
        List<String> strList = new ArrayList<String>();
        strList = Arrays.asList(str);
        for (String string : strList) {
            System.out.println(string);
        }

        numLettersList(strList);

    }

    public static int sumEven (ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void numLetters (ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word length for the search...");
        int wordLength = input.nextInt();
        for (String i : arr) {
            if (i.length() == wordLength) {
                System.out.println(i);
            }
        }
    }

    public static void numLettersList (List<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word length for the search...");
        int wordLength = input.nextInt();
        for (String i : arr) {
            if (i.length() == wordLength) {
                System.out.println(i);
            }
        }
    }
}
