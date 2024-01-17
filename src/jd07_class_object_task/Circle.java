package jd07_class_object_task;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");

        double res1 = scanner.nextDouble();
        scanner.close();

        double perimeter = res1 * 3.14 * 2;

        String formattedValue = String.format("%.1f", perimeter);


        System.out.println("The area of the circle is: " + res1 * res1 * 3.14);
        System.out.println("The perimeter of the Circle is: " + formattedValue);

    }




}
