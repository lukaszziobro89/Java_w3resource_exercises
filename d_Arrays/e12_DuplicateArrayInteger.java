package d_Arrays;
import java.util.Arrays;
/**
 * 12. Write a Java program to find the duplicate values of an array of integer values.
 */
public class e12_DuplicateArrayInteger {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] duplicates = new int[numbers.length];

        numbers[0] = 24;
        numbers[1] = 21;
        numbers[2] = 13;
        numbers[3] = 7;
        numbers[4] = 1;
        numbers[5] = 2;
        numbers[6] = 55;
        numbers[7] = 21;
        numbers[8] = 55;
        numbers[9] = 24;

        System.out.println("Original:   " + Arrays.toString(numbers));

        int k = 0;

        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (element == numbers[j]){
                    duplicates[k++] = element;
                    break;
                }
            }
        }

        System.out.println("Duplicates: " + Arrays.toString(duplicates));

    }
}
