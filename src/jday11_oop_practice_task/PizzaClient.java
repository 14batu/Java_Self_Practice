package jday11_oop_practice_task;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Small",5,2);
        System.out.println(pizza);

        Pizza pizza1 = new Pizza("Large",10,4);
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("Extra Large",5,2);
        System.out.println(pizza2);
    }
}
