package jd04_selection_statements_task;

public class Grade {
    public static void main(String[] args) {
        char value = 'B';
        String result;

        if (value == 'A'){
            result = "Excellent";
        } else if (value == 'B') {
            result = "Great Job";
        } else if (value == 'C') {
            result = "Good";
        } else if (value == 'D') {
            result = "Passed";
        }else if (value == 'F') {
            result = "Failed";
        }else {
            result = "Invalid Grade";
        }
        System.out.println("result = " + result);

    }
}
