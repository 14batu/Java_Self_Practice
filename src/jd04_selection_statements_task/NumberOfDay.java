package jd04_selection_statements_task;

public class NumberOfDay {
    public static void main(String[] args) {
        int month = 2;

        switch (month){
            case 1,3,5,7,8,10,12 -> System.out.println("31 Days");
            case 4,6,9,11 -> System.out.println("30 Days");
            case 2 -> System.out.println("February");
            default -> System.out.println("Invalid");
        }

    }
}
