package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
 * The pattern is as follows :

 1
 22
 333
 4444
 */
public class e17_NoDuplicatesPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms :");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
