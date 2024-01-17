package jd07_class_object_task;
import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your gender: ");
        char gender = scanner.next().charAt(0);

        scanner.nextLine();

        System.out.println("Enter your full name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your phone number: ");
        long telNumber = scanner.nextLong();

        System.out.println("Enter your zip Code: ");
        int zipCode = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName = scanner.nextLine();


        System.out.println("Enter your city name: ");
        String cityName = scanner.nextLine();

        System.out.println("Enter your state name: ");
        String  stateName = scanner.next();

        System.out.println("Enter your building number: ");
        int buildingNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your street: ");
        String streetName = scanner.nextLine();

        scanner.close();


        System.out.println(firstName + "\n" + age + "\n" + gender + "\n" + telNumber + "\n" + "Address: "+ "\n" + "\t" + buildingNumber + " " + streetName + "\n\t" + cityName + ", " + stateName + ", " + zipCode);




    }
}
