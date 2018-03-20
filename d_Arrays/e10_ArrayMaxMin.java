package d_Arrays;

import java.util.Arrays;

/**
 * 10. Write a Java program to find the maximum and minimum value of an array.
 */
public class e10_ArrayMaxMin {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }
        System.out.println("Array: " + Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            // swap max
            if (numbers[i] > max){
                max = numbers[i];
            }
            // swap min
            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
