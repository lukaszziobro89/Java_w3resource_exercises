package a_Basic.e11_e20;

import java.util.Scanner;

/**
 * 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class e12_AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Put 3 numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        System.out.println("Average: " + ((num1 + num2 + num3)/3));

    }
}
