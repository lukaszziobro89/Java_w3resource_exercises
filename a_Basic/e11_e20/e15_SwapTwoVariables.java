package a_Basic.e11_e20;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables.
 */
public class e15_SwapTwoVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put 2 values:");
        double var1 = input.nextDouble();
        double var2 = input.nextDouble();

        System.out.println("Variable 1 (before swapping): " + var1);
        System.out.println("Variable 2 (before swapping): " + var2);

        double temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("\nSwapping...\n");

        System.out.println("Variable 1 (after swapping): " + var1);
        System.out.println("Variable 2 (after swapping): " + var2);

    }
}
