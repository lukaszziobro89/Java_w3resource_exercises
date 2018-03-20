package b_DataTypes;
import java.util.Scanner;
/**
 * 4. Write a Java program to convert minutes into a number of years and days.

 Test Data
 Input the number of minutes: 3456789
 Expected Output :
 3456789 minutes is approximately 6 years and 210 days
 */
public class e4_MinutesIntoYearsAndDays {
    private static final int YEAR_IN_MINUTES = 365 * 24 * 60;
    private static final int DAY_IN_MINUTES = 24 * 60;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of minutes:");
        int numberOfMinutes = input.nextInt();

        int years = numberOfMinutes / YEAR_IN_MINUTES;

        int days = (numberOfMinutes % YEAR_IN_MINUTES) / DAY_IN_MINUTES;

        System.out.println(numberOfMinutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}
