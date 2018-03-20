package c_ConditionalStatement;

import java.util.Scanner;

/**
 * 1. Write a Java program to get a number from the user and print whether it is positive or negative.

 Test Data
 Input number: 35
 Expected Output :
 Number is positive
 */
public class e1_PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put an integer number:");
        int number = input.nextInt();

        if (number >= 0){
            System.out.println("It's a positive number.");
        }else {
            System.out.println("It's a negative number.");
        }
    }

    public static void positiveOrNegative(int number){
        if (number >= 0){
            System.out.println("It's a positive number.");
        }else {
            System.out.println("It's a negative number.");
        }
    }
}
