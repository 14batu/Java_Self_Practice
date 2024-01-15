package jd06_methods_task;

public class OddAndEven {
    public static void main(String[] args) {

        boolean result = isOdd(100);
        System.out.println("result = " + result);
        boolean result1 = isEven(100);
        System.out.println("result1 = " + result1);

    }


    public static boolean isOdd(int num){
        if(num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isEven(int num){
        if (num % 2 != 0){
            return true;
        }else {
            return false;
        }
    }
}
