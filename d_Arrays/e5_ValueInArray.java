package d_Arrays;
/**
 * 5. Write a Java program to test if an array contains a specific value.
 */
public class e5_ValueInArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 24;
        numbers[1] = 21;
        numbers[2] = 13;
        numbers[3] = 7;
        numbers[4] = 55;

        int num1 = 21;
        int num2 = 100;
        boolean check = false;
        boolean check2 = false;

        for(Integer number : numbers){
            if (number == num1){
                check = true;
                break;
            } else {
                check = false;
            }
        }

        System.out.println(check);

        for(Integer number : numbers){
            if (number == num2){
                check2 = true;
                break;
            } else {
                check2 = false;
            }
        }

        System.out.println(check2);
    }
}
