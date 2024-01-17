package jd07_class_object_task;
import java.util.Scanner;

public class PlaceAndOrder {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the product name: ");
        String productName = scanner.nextLine();

        System.out.println("enter the price: ");
        double price = scanner.nextDouble();

        System.out.println("enter the quantity: ");
        int quantity = scanner.nextInt();

        System.out.println("enter first name: ");
        String firstName = scanner.next();

        scanner.close();

        System.out.println(firstName + ", " + "your order for " + quantity + " " + productName + " has been placed. "+ "Your total is " + price * quantity + ".");


    }
}
