package d_Arrays;

import java.util.Arrays;

/**
 * 17. Write a Java program to find the second largest element in an array.
 */
public class e17_SecondLargestElement {
    public static void main(String[] args) {
        int[] elements = new int[6];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = (int)(Math.random() * 10);
        }

        System.out.println("Array: " + Arrays.toString(elements));

        int secondLargest = secondLargestElement(elements);
        System.out.println("Second largest element: " + secondLargest);

    }

    private static int secondLargestElement(int[] elements){
        int temp;
        int max;
        int secondMax;
        // sort array
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i] > elements[j]) {
                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
        max = elements[0];
        secondMax = elements[1];
        if (max < secondMax){
            max = elements[1];
            secondMax = elements[0];
        }
        for (int i = 1; i < elements.length - 1; i++) {
            if (elements[i] > max){
                secondMax = max;
                max = elements[i];
            }else if(elements[i] > secondMax){
                secondMax = elements[i];
            }
        }
        return secondMax;
    }
}
