package jd08_string_practice_task;
import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your e-mail address: ");
        String emailAddress = scanner.nextLine();
        scanner.close();

        emailName(emailAddress);

    }

    public static void emailName(String email){
        int atIndex = email.indexOf("@");

        if (atIndex == -1){
            System.out.println(email);
            return;
        }

        String namePart = email.substring(0,atIndex);
        String domainPart = email.substring(atIndex);

        int underScore = namePart.indexOf("_");

        if (underScore != -1){
            String firstName = namePart.substring(0,underScore);
            String lastName = namePart.substring(underScore + 1);
            System.out.println(lastName + "_" + firstName + domainPart);
        } else {
            System.out.println(email);
        }
    }
}
