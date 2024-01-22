package jd04_selection_statements_task;

public class MedianNumber {

    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int c = 25;

        int median = (a + b + c)/3;

        if (median == a){
            System.out.println(a + " is the median number");
        } else if (median == b) {
            System.out.println(b + " is the median number");
        } else if (median == c) {
            System.out.println(c + " is the median number");
        } else {
            System.out.println("Wrong input");
        }

    }
}
