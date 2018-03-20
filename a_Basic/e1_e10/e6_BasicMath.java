package a_Basic.e1_e10;
import java.util.Scanner;
/**
 * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5
 */
public class e6_BasicMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put first number: ");
        int num1 = input.nextInt();
        System.out.println("Put second number: ");
        int num2 = input.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

    }
}
