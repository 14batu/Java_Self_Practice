package jd04_selection_statements_task;

public class OxygenTank {

    public static void main(String[] args) {

        int level = 75;
        String result;

        if (level > 90) {
            result = "Your tank is full";
        } else if (level > 80 && level <= 90) {
            result = "Still okay";
        } else if (level > 70 && level <= 80) {
            result ="Dont go too far";
        } else if (level > 60 && level <= 70) {
            result = "Start to head back";
        } else if (level >= 50) {
            result = "Be Careful";
        } else {
            result = "You died";
        }
        System.out.println("result = " + result);
    }
}
