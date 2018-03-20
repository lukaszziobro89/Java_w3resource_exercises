package Variables;
import java.util.Scanner;
/**
 * Complete the given Java program such that it multiplies the two inputted integer numbers.
 */
public class MultiplyNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Put 2 numbers number: ");
        int x = input.nextInt();
        int y = input.nextInt();

        int result = x * y;
        System.out.println("Result: " + result);
    }
}
