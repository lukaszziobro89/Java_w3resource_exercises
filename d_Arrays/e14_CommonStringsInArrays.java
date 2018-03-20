package d_Arrays;
import java.util.Arrays;
/**
 * 14. Write a Java program to find the common elements between two arrays (string values).
 */
public class e14_CommonStringsInArrays {
    public static void main(String[] args) {
        String[] first = new String[5];
        String[] second = new String[6];
        first[0] = "abc";
        first[1] = "def";
        first[2] = "abc";
        first[3] = "ddd";
        first[4] = "aaa";

        second[0] = "xxx";
        second[1] = "ddd";
        second[2] = "aaa";
        second[3] = "ewqeqweq";
        second[4] = "ewqewqeqwe";
        second[5] = "abc";

        System.out.println("Original first: " + Arrays.toString(first));
        System.out.println("Original second: " + Arrays.toString(second));

        String[] commonElements;
        commonElements = commonStringsInTwoArrays(first, second);

        System.out.println("Common elements: " + Arrays.toString(commonElements));

    }

    /**
     * Method takes two arrays of String elements as parameters
     * and return array with common elements for both input arrays.
     *
     * @param first array of String elements
     * @param second array of String elements
     * @return array of elements common for both first and second array
     */
    private static String[] commonStringsInTwoArrays(String[] first, String[] second){
        String word = "";
        int k = 0;
        String[] common = new String[first.length];
        // for each word from first array
        for (int i = 0; i < first.length; i++) {
            word = first[i];
            // check if word from first array is also in second one
            for (int j = 0; j < second.length; j++) {
                // if there is add to common array
                if (word.equals(second[j])){
                    // check if word is already in common array
                    for (int m = 0; m < common.length; m++) {
                        // if word already in common then break loop
                        // else if word not in common then add it to common array
                        if (word.equals(common[m])) {
                            break;
                        }else {
                            common[k++] = word;
                            break;
                        }
                    }
                }
            }
        }
        return common;
    }
}
