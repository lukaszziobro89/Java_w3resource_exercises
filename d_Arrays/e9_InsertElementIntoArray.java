package d_Arrays;
import java.util.Arrays;
/**
 * 9. Write a Java program to insert an element (specific position) into an array.
 */
public class e9_InsertElementIntoArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] newNumbers = new int[numbers.length + 1];

        numbers[0] = 24;
        numbers[1] = 21;
        numbers[2] = 13;
        numbers[3] = 7;
        numbers[4] = 55;

        int index = 3;
        int value = 33;
        int j = 0;

        System.out.println("Before change: " + Arrays.toString(numbers));

        for (int i = 0; i < newNumbers.length; i++) {
            if (i == index){
                newNumbers[i] = value;
            }else {
                newNumbers[i] = numbers[j];
                j++;
            }

        }

        System.out.println("After change: " + Arrays.toString(newNumbers));
    }
}
