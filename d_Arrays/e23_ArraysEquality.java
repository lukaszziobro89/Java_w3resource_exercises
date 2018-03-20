package d_Arrays;

public class e23_ArraysEquality {
    public static void main(String[] args) {
        int[] array_1 = new int[5];
        int[] array_2 = new int[5];
        int[] array_3 = new int[5];
        array_1[0] = array_2[0] = array_3[0] = 0;
        array_1[1] = array_2[1] = array_3[1] = 5;
        array_1[2] = array_2[2] = array_3[2] = 3;
        array_1[3] = array_2[3] = array_3[3] = 4;
        array_1[4] = array_2[4] = 6;
        array_3[4] = 11;

        System.out.println("Array1 = Array2 ? " + arraysEquality(array_1,array_2));
        System.out.println("Array1 = Array3 ? " + arraysEquality(array_1,array_3));
        System.out.println("Array2 = Array3 ? " + arraysEquality(array_2,array_3));

    }

    private static boolean arraysEquality(int[] array1, int[] array2){
        if (array1.length != array2.length){
            return false;
        }else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]){
                    return false;
                }
            }
            return true;
        }
    }
}
