package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 5, 8};

        for (int i : numbers) {
            if (i % 2 != 0)
                System.out.println(i);
        }

        String text = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] textArray = text.split(" ");
        System.out.println(textArray.length);
        System.out.println(Arrays.toString(textArray));
        String[] sentenceArray = text.split("\\.");
        System.out.println(sentenceArray.length);
        System.out.println(Arrays.toString(sentenceArray));
    }

}
