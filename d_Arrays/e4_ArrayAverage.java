package d_Arrays;
/**
 * 4. Write a Java program to calculate the average value of array elements.
 */
public class e4_ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 24;
        numbers[1] = 21;
        numbers[2] = 13;
        numbers[3] = 7;
        numbers[4] = 55;
        int sum = 0;

        for(Integer number : numbers){
            sum+= number;
        }
        System.out.println("Average value: " + (sum / numbers.length));
        System.out.println("Average value: " + ((24+21+13+7+55) / 5));

    }
}
