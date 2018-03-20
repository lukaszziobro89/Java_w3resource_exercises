package c_ConditionalStatement;

import java.util.Scanner;

/**
 * 5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

 Test Data
 Input number: 3
 Expected Output :
 Wednesday

 */
public class e5_DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input day of the week:");
        int day = input.nextInt();

        while(day < 1 || day > 7){
            System.out.println("Not valid number. Only 1-7 acceptable.");
            System.out.println("---------------------------------------");
            System.out.println("Input day of the week:");
            day = input.nextInt();
        }

        switch (day){
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday"); break;
            case 4:
                System.out.println("Thursday"); break;
            case 5:
                System.out.println("Friday"); break;
            case 6:
                System.out.println("Saturday"); break;
            case 7:
                System.out.println("Sunday"); break;
        }
    }
}
