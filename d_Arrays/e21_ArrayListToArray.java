package d_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * 21. Write a Java program to convert an ArrayList to an array.
 */
public class e21_ArrayListToArray {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(1);
        int[] array = arrayListToArray(arrayList);

        System.out.println(Arrays.toString(array));
    }

    private static int[] arrayListToArray(ArrayList<Integer> arrayList){
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }
}
