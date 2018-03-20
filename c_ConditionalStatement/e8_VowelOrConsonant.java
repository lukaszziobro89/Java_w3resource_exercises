package c_ConditionalStatement;
import java.util.Scanner;
/**
 * 8. Write a Java program that takes the user to provide a single character from the alphabet.
 Print Vowel or Consonant, depending on the user input.
 If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

 Test Data
 Input an alphabet: p
 Expected Output :
 Input letter is Consonant

 */
public class e8_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet letter:");
        String inputString = input.nextLine();

        if (inputString.length() !=1){
            System.out.println("Not a single letter.");
            System.exit(0);
        } else {
            char letter = inputString.charAt(0);
            int asciiCode = (int)letter;

            if (asciiCode < 97 || asciiCode > 122) {
                System.out.println("Not a letter.");
            } else {
                if (asciiCode == 97 || asciiCode == 101 || asciiCode == 105 || asciiCode == 111 || asciiCode == 117){
                    System.out.println("Vowel");
                }else{
                    System.out.println("Consonant");
                }
            }
        }
    }
}
