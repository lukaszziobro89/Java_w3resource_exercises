package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 15. Write a program in Java to display the n terms of odd natural number and their sum.

 Test Data
 Input number of terms is: 5
 Expected Output :

 The odd numbers are :
 1
 3
 5
 7
 9
 The Sum of odd Natural Number upto 5 terms is: 25
 */
public class e15_SumOfNOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms :");
        int number = input.nextInt();
        int sum = 0;
        int i = 1;
        int counter = 1;

        while (counter <= number){
            System.out.println(i);
            sum += i;
            counter++;
            i += 2;
        }

        System.out.println("Sum: " + sum);
    }
}