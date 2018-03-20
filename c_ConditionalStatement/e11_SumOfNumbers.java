package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 11. Write a program in Java to display n terms of natural numbers and their sum.

 Test Data
 Input the number: 2
 Expected Output :

 Input number:
 2
 The first n natural numbers are :
 2
 1
 2
 The Sum of Natural Number upto n terms :
 23

 */
public class e11_SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number:");
        int num = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
