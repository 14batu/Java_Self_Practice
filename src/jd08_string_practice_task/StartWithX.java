package jd08_string_practice_task;
import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input: ");

        String askUser = scanner.next();
        scanner.close();

        System.out.println(askUser.replaceFirst("x","a"));







    }
}
