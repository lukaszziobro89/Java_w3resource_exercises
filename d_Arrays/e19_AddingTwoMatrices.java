package d_Arrays;
/**
 * 19. Write a Java program to add two matrices of the same size.
 */
public class e19_AddingTwoMatrices {
    public static void main(String[] args) {
        int[][] first  = new int[3][3];
        int[][] second  = new int[3][3];
        // fill matrixes with int numbers
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                first[i][j] = (int)(Math.random()*10);
                second[i][j] = (int)(Math.random()*10);
            }
        }

        printMatrix(first);
        System.out.println("------");
        printMatrix(second);
        System.out.println("------");
        int[][] sum = sumTwoMatrices(first,second);
        printMatrix(sum);
    }

    private static int[][] sumTwoMatrices(int[][] first, int[][] second){
        int[][] sum = new int[first.length][first[0].length];
        if (first.length != second.length || first[0].length != second[0].length){
            System.out.println("Not the same sizes.");
        } else{

            for (int i = 0; i < first.length; i++) {
                for (int j = 0; j < first[0].length; j++) {
                    sum[i][j] = first[i][j] + second[i][j];
                }
            }
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
