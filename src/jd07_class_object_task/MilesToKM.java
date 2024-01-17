package jd07_class_object_task;
import java.util.Scanner;

public class MilesToKM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the miles: ");

        double miles = scanner.nextDouble();

        scanner.close();

        double conversion = miles * 1.609;

        System.out.println(miles + " miles is equal to " + conversion + " Kilometer");


    }



}
