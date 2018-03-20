package d_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * 11. Write a Java program to reverse an array of integer values.
 */
public class e11_ReverseArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }
        System.out.println("Original array: " + Arrays.toString(numbers));

        int j = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[j];
            j--;
        }
        System.out.println("Reversed array: " + Arrays.toString(reversed));
    }
}
