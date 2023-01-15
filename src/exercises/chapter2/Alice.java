package exercises.chapter2;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String text = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?'";
//        System.out.println(text);
        String textLower = text.toLowerCase();
        System.out.println("Enter a term to search within the text of Alice in Wonderland.");
        String search = input.next().toLowerCase();
        System.out.println(textLower.contains(search));
        System.out.println(textLower.indexOf(search));
        System.out.println(search.length());
        String modifiedText = textLower.replace(search, "_");
        System.out.println(modifiedText);
        input.close();
    }
}
