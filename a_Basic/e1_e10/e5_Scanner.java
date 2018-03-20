package a_Basic.e1_e10;
import java.util.Scanner;
/**
 * 5. Write a Java program that takes two numbers as input and display the product of two numbers.
 Test Data:
 Input first number: 25
 Input second number: 5
 Expected Output :
 25 x 5 = 125
 */
public class e5_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put first number: ");
        int num1 = input.nextInt();
        System.out.println("Put second number: ");
        int num2 = input.nextInt();
        System.out.println("Result = " + num1 * num2);
    }
}
