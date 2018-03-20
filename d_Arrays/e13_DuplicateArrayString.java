package d_Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * 13. Write a Java program to find the duplicate values of an array of string values.
 */
public class e13_DuplicateArrayString {
    public static void main(String[] args) {
        String[] words = new String[10];
        String[] duplicates = new String[words.length];
        words[0] = "abc";
        words[1] = "def";
        words[2] = "abc";
        words[3] = "ddd";
        words[4] = "aaa";
        words[5] = "xxx";
        words[6] = "ddd";
        words[7] = "aaa";
        words[8] = "ewqeqweq";
        words[9] = "ewqewqeqwe";

        System.out.println("Original: " + Arrays.toString(words));
        duplicates = removeDuplicateStrings(words);
        System.out.println("Duplicates: " + Arrays.toString(duplicates));

    }

    /**
     * Method takes string array 'words' as parameter, finds all duplicate values and saves
     * them in separate array named 'duplicates'
     *
     * @param words contains array with possible duplicate String elements
     * @return array with duplicate values from words array
     */
    private static String[] removeDuplicateStrings(String[] words){
        String[] duplicates = new String[words.length];
        int k = 0;
        String word = "";

        for (int i = 0; i < words.length; i++) {
            word = words[i];
            for (int j = i + 1; j < duplicates.length; j++) {
                if (word.equals(words[j])){
                    duplicates[k++] = word;
                    break;
                }
            }
        }
        return duplicates;
    }
}
