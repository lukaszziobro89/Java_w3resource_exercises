package d_Arrays;
/**
 * 2. Write a Java program to sum values of an array.
 */
public class e2_SumValuesOfArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 24;
        numbers[1] = 21;
        numbers[2] = 13;
        numbers[3] = 7;
        numbers[4] = 55;

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) { sum += numbers[i]; }

        for(Integer number : numbers){ sum += number; }

        System.out.println(sum);
        System.out.println(24 + 21 + 13 + 7 + 55);
    }
}
