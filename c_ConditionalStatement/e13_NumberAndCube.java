package c_ConditionalStatement;
import java.util.Scanner;
/**
 *13. Write a program in Java to display the cube of the number upto given an integer.

 Test Data
 Input number of terms : 4
 Expected Output :

 Number is : 1 and cube of 1 is : 1
 Number is : 2 and cube of 2 is : 8
 Number is : 3 and cube of 3 is : 27
 Number is : 4 and cube of 4 is : 64

 */
public class e13_NumberAndCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms :");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("Number is : " + i + " and cube of " + i + " is :" + (Math.pow(i, 3)));
        }
    }
}
