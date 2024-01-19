package jd08_string_practice_task;
import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Input: ");
        String firstInput = scanner.next();

        System.out.println("Enter Input 2: ");
        String secondInput = scanner.next();

        scanner.close();

        if (firstInput.charAt(firstInput.length() - 1 ) == secondInput.charAt(0)){
            System.out.println(firstInput + secondInput.substring(1));
        } else {
            System.out.println("Wrong Input");
        }


    }
}
