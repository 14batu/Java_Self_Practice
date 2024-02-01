package jday10_array_list_practice_task;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java";

        int upperCase = 0;
        int lowerCase = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)){
                upperCase++;
            } else if (Character.isLowerCase(c)) {
                lowerCase++;
            }
        }

        boolean result = upperCase == lowerCase;
        System.out.println(result);


    }
}
