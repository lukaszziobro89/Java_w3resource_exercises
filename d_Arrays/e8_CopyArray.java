package d_Arrays;

import java.util.Arrays;

/**
 * 8. Write a Java program to copy an array by iterating the array.
 */
public class e8_CopyArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] newNumbers = new int[numbers.length];
        int[] newNumbers2 = new int[numbers.length];

        numbers[0] = 24;
        numbers[1] = 21;
        numbers[2] = 13;
        numbers[3] = 7;
        numbers[4] = 55;

        // standard iteration
        for (int i = 0; i < newNumbers.length; i++) {
            newNumbers[i] = numbers[i];
        }

        // foreach iteration
        System.arraycopy(numbers,0,newNumbers2,0,numbers.length);

        System.out.println("Standard iteration: " + Arrays.toString(newNumbers));
        System.out.println("Standard iteration: " + Arrays.toString(newNumbers2));
    }
}
