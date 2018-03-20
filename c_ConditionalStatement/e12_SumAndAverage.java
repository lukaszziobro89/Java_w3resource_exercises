package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 12. Write a program in Java to input 5 numbers from keyboard and find their sum and average.

 Test Data
 Input the 5 numbers : 1 2 3 4 5
 Expected Output :

 Input the 5 numbers :
 1
 2
 3
 4
 5
 The sum of 5 no is : 15
 The Average is : 3.0

 */
public class e12_SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int counter = 1;
        int i = 1;
        int sum = 0;

        while (counter < 6){
            System.out.println("Put " + i + " number:");
            int num = input.nextInt();
            numbers[i-1] = num;
            i++;
            counter++;
            sum += num;
        }

        System.out.println("\nNumbers:");
        for (Integer number : numbers){
            System.out.println(number);
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / numbers.length));

    }
}
