package d_Arrays;

import java.util.Arrays;

/**
 * 15. Write a Java program to find the common elements between two arrays of integers.
 */
public class e15_CommonIntegersInArray {
    public static void main(String[] args) {
        int[] first = new int[5];
        int[] second = new int[5];
        int[] common;

        for (int i = 0; i < first.length; i++) {
            first[i] = i;
            second[i] = i + 2;
        }
        System.out.println("First:  " + Arrays.toString(first));
        System.out.println("Second: " + Arrays.toString(second));

        common = commonIntegersInTwoArrays(first, second);

        System.out.println("Common :" + Arrays.toString(common));

    }

    /**
     *
     * @param first contains array of integer values
     * @param second contains array of integer values
     * @return array of integer values common for both first and second arrays
     */
    private static int[] commonIntegersInTwoArrays(int[] first, int[] second){
        int[] common = new int[first.length];
        int k = 0;
        int num;
        // for each number in first array
        for (int i = 0; i < first.length; i++) {
            num = first[i];
            // check if number is also in second array
            for (int j = 0; j < second.length; j++) {
                if (num == second[j]) {
                    for (int m = 0; m < common.length; m++) {
                        if (num == common[m]) {
                            break;
                        } else {
                            common[k++] = num;
                            break;
                        }
                    }
                }
            }
        }
        return common;
    }

}
