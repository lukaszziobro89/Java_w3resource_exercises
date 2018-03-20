package a_Basic.e11_e20;

import java.util.Scanner;

/**
 * 11. Write a Java program to print the area and perimeter of a circle.
 Test Data:
 Radius = 7.5
 Expected Output
 Perimeter is = 47.12388980384689
 Area is = 176.71458676442586
 */
public class e11_CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put radius of circle:");
        double radius = input.nextDouble();

        System.out.println("Perimeter is = " + (2 * Math.PI * radius));
        System.out.println("Area is = " + (Math.PI * Math.pow(radius,2)));
    }
}
