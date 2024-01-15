package general_tasks;

public class ternaryOperators2 {

    public static void main(String[] args) {

        int age = 26;

        String result = (age > 25) ? "older than 25" : (age < 25) ? "younger than 25" :"invalid age";

        System.out.println("result = " + result);
    }
}
