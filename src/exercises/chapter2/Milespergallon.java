package exercises.chapter2;

import java.util.Scanner;

public class Milespergallon {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven...");
        double miles = input.nextDouble();
        System.out.println("Enter amount of gas consumed in gallons...");
        double gallons = input.nextDouble();
        double mpg = miles / gallons;
        System.out.println("Your miles per gallon for trip is " + mpg);

//        Write a program that asks a user
//        for the number of miles they have driven
//        and the amount of gas they’ve consumed (in gallons)
//        , and print their miles-per-gallon.

    }
}
