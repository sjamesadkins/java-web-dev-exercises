package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        double radius;
        double pi = 3.14;
        Scanner input;

        input = new Scanner(System.in);

        do {
            System.out.println("Please enter a radius...");
            while (!input.hasNextDouble()) {
                System.out.println("The radius must be a double. Try again.");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        System.out.println("The area of the circle with radius " + radius + " is " + Circle.getArea(radius));

        input.close();



    }
}
