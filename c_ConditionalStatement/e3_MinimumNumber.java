package c_ConditionalStatement;

import java.util.Scanner;

/**
 * 3. Take three numbers from the user and print the greatest number.

 Test Data
 Input the 1st number: 25
 Input the 2nd number: 78
 Input the 3rd number: 87
 Expected Output :
 The greatest: 87
 */
public class e3_MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the 1st number:");
        int a = input.nextInt();
        System.out.println("Input the 2nd number:");
        int b = input.nextInt();
        System.out.println("Input the 3rd number:");
        int c = input.nextInt();

        if (a > b){
            if (a > c){
                System.out.println("Max: " + a);
            }else {
                System.out.println("Max: " + c);
            }
        }else {
            if (b > c){
                System.out.println("Max: " + b);
            }else {
                System.out.println("Max: " + c);
            }
        }
    }
}
