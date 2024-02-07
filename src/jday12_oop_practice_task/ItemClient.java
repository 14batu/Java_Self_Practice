package jday12_oop_practice_task;

public class ItemClient {
    public static void main(String[] args) {
        Item item = new Item("Batuhan", 14.54, 10);
        System.out.println(item);

        Item item1 = new Item("@batuhan", 15, 10);
        System.out.println(item1);

        Item item2 = new Item("1batuhan", 15, 10);
        System.out.println(item2);

        Item item3 = new Item("batuhan", -2, 10);
        System.out.println(item3);
    }
}
