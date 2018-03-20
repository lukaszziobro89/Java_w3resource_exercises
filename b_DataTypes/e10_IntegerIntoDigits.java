package b_DataTypes;
import java.util.Scanner;
/*
10. Write a Java program to break an integer into a sequence of individual digits.

Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6
 */
public class e10_IntegerIntoDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number:");
        int number = input.nextInt();

        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            System.out.print(numberString.charAt(i) + " ");
        }

    }
}
