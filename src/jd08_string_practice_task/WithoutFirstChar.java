package jd08_string_practice_task;
import java.util.Scanner;



public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Input : ");
        String firstInput = scanner.next();

        System.out.println("Second Input : ");
        String  secondInput = scanner.next();

        scanner.close();

        String first = firstInput.substring(1);
        String second = secondInput.substring(1);

        System.out.println(first+second);

    }
}
