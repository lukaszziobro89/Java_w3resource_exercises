package b_DataTypes;
import java.util.Scanner;
/**
 * 6. Write a Java program to compute body mass index (BMI).

 Test Data
 Input weight in pounds: 452
 Input height in inches: 72
 Expected Output:
 Body Mass Index is 61.30159143458721
 */
public class e6_BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input weight in pounds:");
        int weight = input.nextInt();
        System.out.println("Input height in inches:");
        int height = input.nextInt();
        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println("BMI is " + BMI);

    }
}
