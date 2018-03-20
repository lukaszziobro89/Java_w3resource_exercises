package a_Basic.e11_e20;
import java.util.Scanner;
/**
 * 13. Write a Java program to print the area and perimeter of a rectangle.
 Test Data:
 Width = 5.5 Height = 8.5

 Expected Output
 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class e13_AreaPerimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put width:");
        double width = input.nextDouble();
        System.out.println("Put height:");
        double height = input.nextDouble();

        System.out.println("Area is " + width * height);
        System.out.println("Perimeter is " + 2*(width + height));

    }
}
