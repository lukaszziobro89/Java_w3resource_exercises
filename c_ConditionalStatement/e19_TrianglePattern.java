package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.

    1
   2 2
  3 3 3
 4 4 4 4
 */
public class e19_TrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of terms :");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
