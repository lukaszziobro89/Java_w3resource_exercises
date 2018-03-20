package b_DataTypes;
import java.util.Scanner;
/**
 * 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

 Test Data
 Input an integer between 0 and 1000: 565
 Expected Output :
 The sum of all digits in 565 is 16
 */
public class e3_SumNumberDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000:");
        int number = input.nextInt();

        System.out.println("Sum using method: " + sumDigits(number));

        int sum = 0;
        // 1000
        int e1 = number / 1000;
        sum += e1;
        number = number % 1000;

        // 100
        int e2 = number / 100;
        sum += e2;
        number = number % 100;

        // 10
        int e3 = number / 10;
        sum += e3;
        number = number % 10;

        System.out.println("Sum dividing: " + (sum + number));
    }

    private static double sumDigits(int number){
        double sum = 0;
        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
