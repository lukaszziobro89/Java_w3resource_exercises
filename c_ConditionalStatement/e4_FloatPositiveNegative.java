package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
 Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

 Test Data
 Input value: 25
 Expected Output :
 Positive number

 */
public class e4_FloatPositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the 1st number:");
        float number = input.nextFloat();

        if (number > 0){
            if (number < 1){
                System.out.println("small positive");
            } else if(number > 1000000){
                System.out.println("large positive");
            }else {
                System.out.println("positive");
            }
        }else if(number < 0){
            if (Math.abs(number) < 1){
                System.out.println("small negative");
            } else if(Math.abs(number) > 1000000){
                System.out.println("large negative");
            }else {
                System.out.println("negative");
            }
        }else {
            System.out.println("Zero.");
        }
    }
}
