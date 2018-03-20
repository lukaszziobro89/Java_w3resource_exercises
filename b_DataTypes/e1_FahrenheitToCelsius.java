package b_DataTypes;
import java.util.Scanner;
/**
 * 1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
 Test Data
 Input a degree in Fahrenheit: 212
 Expected Output:
 212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */
public class e1_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit-32)*5/9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

    }
}
