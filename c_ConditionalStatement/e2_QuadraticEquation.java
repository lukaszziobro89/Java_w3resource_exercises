package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 2. Write a Java program to solve quadratic equations (use if, else if and else).

 Test Data
 Input a: 1
 Input b: 5
 Input c: 1
 Expected Output :
 The roots are -0.20871215252208009 and -4.7912878474779195
 */
public class e2_QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a:");
        int a = input.nextInt();
        System.out.println("Input b:");
        int b = input.nextInt();
        System.out.println("Input c:");
        int c = input.nextInt();

        double delta = (b * b) - (4 * a * c);

        if (delta < 0){
            System.out.println("No roots");
        } else if(delta == 0){
            double r0 = (-b / (2 * a));
            System.out.println("Root: " + r0);
        } else {
            double r1 = ((-b - Math.sqrt(delta)) / (2*a));
            double r2 = ((-b + Math.sqrt(delta)) / (2*a));
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        }

    }
}
