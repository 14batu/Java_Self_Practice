package jd06_methods_task;

public class MaximumAndMinumum {
    public static void main(String[] args) {

        double n = max(10.5,30.2);
        System.out.println("n = " + n);

        int m = min(100,200);
        System.out.println("m = " + m);

    }

    public static int max (int num1,int num2){
        if(num1 > num2){
            return num1;
        } else  {
            return num2;
        }

    }
    public static double max (double num1, double num2){
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static int min (int num1, int num2){
        if (num1 < num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static double min (double num1, int num2){
        if (num1 < num2) {
            return num1;
        }else {
            return num2;
        }
    }

}
