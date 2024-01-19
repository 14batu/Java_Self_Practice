package jd08_string_practice_task;
import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();

        scanner.close();

        userInfo(email);

    }
    public static void userInfo(String mail){

        int atIndex = mail.indexOf("@");
        int comIndex = mail.indexOf(".");
        int underscoreIndex = mail.indexOf("_");

        String namePart = mail.substring(0,atIndex);
        String domainPart = mail.substring(atIndex + 1,comIndex);

        String firstName = namePart.substring(0,underscoreIndex);
        String lastName = namePart.substring(underscoreIndex + 1,atIndex);


        String newFirstName = firstName.replace(firstName.charAt(0),firstName.toUpperCase().charAt(0));
        String newLastName = lastName.replace(lastName.charAt(0),lastName.toUpperCase().charAt(0));

        System.out.println("First Name : " + newFirstName + "\n" + "Last Name : " + newLastName + "\n" + "Domain Name : " + domainPart);

    }
}
