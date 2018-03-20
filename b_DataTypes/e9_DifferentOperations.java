package b_DataTypes;
import java.util.Scanner;
/**
 * 9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average,
 the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).

 Test Data
 Input 1st integer: 25
 Input 2nd integer: 5
 Expected Output :
 Sum of two integers: 30
 Difference of two integers: 20
 Product of two integers: 125
 Average of two integers: 15.00
 Max integer: 25
 Min integer: 5
 */
public class e9_DifferentOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = input.nextInt();
        System.out.println("Input second number:");
        int num2 = input.nextInt();

        System.out.println("Sum of two integers: " + (num1 + num2));
        System.out.println("Difference of two integers: " + (num1 - num2));
        System.out.println("Product of two integers: " + (num1 * num2));
        System.out.println("Average of two integers: " + ((num1 + num2)/2));
        System.out.println("Max integer: " + (Math.max(num1, num2)));
        System.out.println("Min integer: " + (Math.min(num1, num2)));
    }
}
