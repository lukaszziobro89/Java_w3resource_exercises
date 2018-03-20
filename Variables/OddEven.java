package Variables;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char answer;

        do {
            // check number
            System.out.print("Put number: ");
            int num = input.nextInt();
            System.out.println("Given number is: " + (num % 2 == 0 ? "Even" : "Odd"));

            // ask if user wants to check another number
            System.out.println("Again? ('y' for yes)");
            answer = input.next().toLowerCase().charAt(0);

        } while (answer == 'y');
    }
}
