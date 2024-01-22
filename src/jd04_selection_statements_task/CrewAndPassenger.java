package jd04_selection_statements_task;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int number = 75;

        if (number == 50){
            System.out.println("20 Crew, 30 passengers");
        } else if (number == 75) {
            System.out.println("25 Crew, 50 passenger");
        } else if (number == 100) {
            System.out.println("30 Crew, 70 passenger");
        } else {
            System.out.println("Not Valid");
        }
    }
}
