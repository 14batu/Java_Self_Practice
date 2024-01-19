package jd08_string_practice_task;
import java.util.Locale;
import java.util.Scanner;

public class LoverAndUpper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name : ");
        String firstName = scanner.next();

        System.out.println("Enter your last name : ");
        String lastName = scanner.next();

        scanner.close();

        convertToCorrection(firstName,lastName);

    }

    public static void convertToCorrection(String firstName, String lastName){
        String lowerCase = firstName.toLowerCase();
        String lowerLastCase = lastName.toLowerCase();

        String newFirstName = lowerCase.substring(0,1).toUpperCase();
        String newLastName = lowerLastCase.substring(0,1).toUpperCase();

        String doneFirstName = newFirstName + lowerCase.substring(1);
        String doneLastName = newLastName + lowerLastCase.substring(1);

        System.out.println(doneFirstName + " " + doneLastName);
    }
}
