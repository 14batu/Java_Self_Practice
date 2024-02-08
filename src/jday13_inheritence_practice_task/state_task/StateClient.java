package jday13_inheritence_practice_task.state_task;

public class StateClient {
    public static void main(String[] args) {

        California california = new California("California","CA","Republican","Muhtar",1_800_000);
        System.out.println(california);

        Texas texas = new Texas("Texas","TX","Democrat","Batu",45_000_000);
        System.out.println(texas);

        Virginia virginia = new Virginia("Virgina"," "," "," ",43_433_444);
        System.out.println(virginia);
    }
}
