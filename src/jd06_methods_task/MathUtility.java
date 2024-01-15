package jd06_methods_task;

public class MathUtility {
    public static void main(String[] args) {

        int result = calculate(10,'+',20);
        System.out.println("result = " + result);

        double result1 = calculate(2.5,'*',3.0);
        System.out.println("result = " + result1);

        int num = square(8);
        System.out.println("num = " + num);
        
        int nums = cube(3);
        System.out.println("nums = " + nums);

    }

    public static int calculate (int num1, char operator, int num2){

//        boolean mathOperator = operator == '+' || operator == '-' || operator == '/' || operator == '*';
//
//        if (!mathOperator){
//            System.err.println("Invalid Operator");
//        }
        if (operator == '+'){
            return num1 + num2;
        } else if (operator == '-') {
            return num1 - num2;
        } else if (operator == '*') {
            return num1 * num2;
        } else if (operator == '/') {
            return num1 * num2;
        } else {
            return 0;
        }

    }
    public static double calculate (double num1, char operator, double num2){

//        boolean mathOperator = operator == '+' || operator == '-' || operator == '/' || operator == '*';
//
//        if (!mathOperator){
//            System.err.println("Invalid Operator");
//        }
        if (operator == '+'){
            return num1 + num2;
        } else if (operator == '-') {
            return num1 - num2;
        } else if (operator == '*') {
            return num1 * num2;
        } else if (operator == '/') {
            return num1 * num2;
        } else {
            return 0;
        }

    }

    public static int square (int num1){
       return calculate(num1,'*',num1);
    }
    public static int cube (int num1){
        return square(num1) * num1;
    }
}
