package jd05_loops_practice_task;

public class FactorialNumber {

    public static void main(String[] args) {

        int givenNumber = 5;
        int sum = 1;

        for (int i = 1; i <= givenNumber; i++) {
            sum *= i;

        }
        System.out.println("sum = " + sum);
    }
}
