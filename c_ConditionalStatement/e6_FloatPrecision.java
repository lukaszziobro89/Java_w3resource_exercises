package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

 Test Data
 Input floating-point number: 1256
 Input floating-point another number: 3254
 Expected Output :
 They are different
 */
public class e6_FloatPrecision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number:");
        float number1 = input.nextFloat();
        System.out.println("Input second number:");
        float number2 = input.nextFloat();

        double r1 = Math.round(number1 * 1000);
        r1 = r1 / 1000;
        double r2 = Math.round(number2 * 1000);
        r2 = r2 / 1000;

        System.out.println(r1 == r2 ? "x = y" : "x != y");

    }
}
