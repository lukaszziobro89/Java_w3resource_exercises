package d_Arrays;
/**
 * 22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
 */
public class e22_FindPairsEqualToNumber {
    public static void main(String[] args) {
        int[] inputData = new int[5];
        inputData[0] = 1;
        inputData[1] = 2;
        inputData[2] = 0;
        inputData[3] = 3;
        inputData[4] = 1;
        int inputNumber = 3;

        int[][] pairs;
        pairs = pairsValue(inputData,inputNumber);
        for (int i = 0; i < pairs.length; i++) {
            if (!(pairs[i][0] == 0 && pairs[i][1] == 0)) {
                System.out.print(pairs[i][0] + "-" + pairs[i][1]);
                System.out.println();
            }
        }


    }

    public static int[][] pairsValue(int[] inputArray, int inputNumber){
        int[][] pairs = new int[inputArray.length][2];
        int k = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputNumber){
                    pairs[k][0] = inputArray[i];
                    pairs[k][1] = inputArray[j];
                    k++;
                }
            }

        }
        return pairs;
    }

}
