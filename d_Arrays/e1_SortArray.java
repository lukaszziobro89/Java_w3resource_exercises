package d_Arrays;

import java.util.Arrays;

/**
 * 1. Write a Java program to sort a numeric array and a string array.
 */
public class e1_SortArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] words = new String[5];

        numbers[0] = 24;
        numbers[1] = 21;
        numbers[2] = 13;
        numbers[3] = 7;
        numbers[4] = 55;

        words[0] = "d";
        words[1] = "c";
        words[2] = "e";
        words[3] = "b";
        words[4] = "a";

        Arrays.sort(numbers);
        Arrays.sort(words);

        for(Integer number : numbers){
            System.out.println(number);
        }

        for (String word : words){
            System.out.println(word);
        }

    }
}
