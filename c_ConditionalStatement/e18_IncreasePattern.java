package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 18. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like :

 1
 2 3
 4 5 6
 7 8 9 10
 */
public class e18_IncreasePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms :");
        int number = input.nextInt();
        int k = 1;
        int j;

        for (int i = 1; k <= number; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
