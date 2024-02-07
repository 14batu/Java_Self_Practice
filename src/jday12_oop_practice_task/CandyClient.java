package jday12_oop_practice_task;

public class CandyClient {
    public static void main(String[] args) {
        Candy candy = new Candy("Apple",10,0,false);
        System.out.println(candy);

        Candy candy2 = new Candy("Apple",-2,0,false);
        System.out.println(candy2);


        Candy candy3 = new Candy("Apple",2,-2,false);
        System.out.println(candy3);
    }
}
