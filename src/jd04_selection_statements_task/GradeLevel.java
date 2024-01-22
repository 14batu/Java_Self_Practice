package jd04_selection_statements_task;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeNumber = 8;

        String result;

        if (gradeNumber >= 1 && gradeNumber <=5){
            result = "Elementary School";
        } else if (gradeNumber >= 6 && gradeNumber <= 8) {
            result = "Middle School";
        } else if (gradeNumber >= 9 && gradeNumber <= 12) {
            result = "High School";
        } else if (gradeNumber >= 13 && gradeNumber <= 16) {
            result ="college";
        } else if (gradeNumber >= 17 && gradeNumber <= 18) {
            result = "Grad School";
        } else {
            result ="Invalid grade level";
        }
        System.out.println("result = " + result);
    }
}
