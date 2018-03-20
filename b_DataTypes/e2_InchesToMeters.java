package b_DataTypes;
import java.util.Scanner;
/**
 * 2. Write a Java program that reads a number in inches, converts it to meters.
 Note: One inch is 0.0254 meter.
 Test Data
 Input a value for inch: 1000
 Expected Output :
 1000.0 inch is 25.4 meters
 */
public class e2_InchesToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        double inches = input.nextDouble();
        double meters = 0.0254 * inches;
        System.out.println(inches + " inch is " + meters + " meters");

    }
}
