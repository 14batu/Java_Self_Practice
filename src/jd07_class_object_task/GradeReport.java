package jd07_class_object_task;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your Score: ");
        int result = scanner.nextInt();

        scanner.close();
        char grade;
        if (result < 100 && result > 0) {
            if (result > 80) {
                grade = 'A';
                System.out.println("Your grade is: " + grade);

            } else if (result > 70 && result < 80) {
                grade = 'B';
                System.out.println("Your grade is: " + grade);

            } else if (result > 60 && result < 70) {
                grade = 'C';
                System.out.println("Your grade is: " + grade);

            } else if (result > 50 && result < 60) {
                grade = 'D';
                System.out.println("Your grade is: " + grade);

            } else {
                grade = 'F';
                System.out.println("Your grade is: " + grade);

            }

        } else {
            System.out.println("Invalid Score");
        }



    }
}
