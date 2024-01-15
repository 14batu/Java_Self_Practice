package jd05_loops_practice_task;

public class SumOfNumbers {

    public static void main(String[] args) {

        int givenNumber = 50;
        int sum = 0;

        for (int i = 1; i <= givenNumber; i++) {

            sum += i;

        }
        System.out.println("sum = " + sum);
    }
}
