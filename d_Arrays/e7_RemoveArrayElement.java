package d_Arrays;

import java.util.Arrays;

/**
 * 7. Write a Java program to remove a specific element from an array.
 */
public class e7_RemoveArrayElement {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] newNumbers = new int[numbers.length - 1];

        numbers[0] = 24;
        numbers[1] = 21;
        numbers[2] = 13;
        numbers[3] = 7;
        numbers[4] = 55;

        int index = 2;
        int j = 0;
        System.out.println("Before removing: " + Arrays.toString(numbers));

        for (int i = 0; i < newNumbers.length; i++) {
            if (i==index){
                newNumbers[i] = numbers[++j];
                j++;
            }else {
                newNumbers[i] = numbers[j];
                j++;
            }
        }

        System.out.println("After removing: " + Arrays.toString(newNumbers));
    }
}
