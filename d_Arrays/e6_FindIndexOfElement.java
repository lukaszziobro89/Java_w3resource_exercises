package d_Arrays;
/**
 * 6.Write a Java program to find the index of an array element.
 */
public class e6_FindIndexOfElement {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 24;
        numbers[1] = 21;
        numbers[2] = 13;
        numbers[3] = 7;
        numbers[4] = 55;

        int number = 13;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number){
                System.out.println(i);
            }
        }

    }
}
