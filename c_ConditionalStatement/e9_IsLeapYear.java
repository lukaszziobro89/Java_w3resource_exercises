package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 9. Write a Java program that takes a year from user and print whether that year is a leap year or not.

 Test Data
 Input the year: 2016
 Expected Output :
 2016 is a leap year
 */
public class e9_IsLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put a year:");
        int year = input.nextInt();

        if (year % 4 == 0){
            System.out.println("Common year.");
        }else if (year % 100 != 0){
            System.out.println("Leap year.");
        } else if(year % 400 != 0){
            System.out.println("Common year");
        }else {
            System.out.println("Leap year");
        }
    }
}
