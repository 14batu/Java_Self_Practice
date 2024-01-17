package jd07_class_object_task;
import java.util.Scanner;

public class CentsToDollar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the cents: ");

        int result = scanner.nextInt();

        scanner.close();

        int num1 = result / 100;
        int num2 = result - num1 * 100;

        System.out.println(result + " cents is  equal to " + num1 + " dollars and " + num2 + " cents");


    }
}
