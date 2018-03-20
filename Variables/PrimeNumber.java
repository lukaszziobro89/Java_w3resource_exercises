package Variables;

import java.util.Scanner;

/**
 * Write a Java program to find if the input number is prime or not
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Put number: ");
        int num = input.nextInt();
        boolean prime = true;

        for (int i = 1; i < num; i++) {
            if (num % 2 == 0){
                prime = false;
                break;
            }
        }
        System.out.println("Number is " + (prime ? "prime" : "not prime."));
        System.out.println("-------------------------");
    }
}
