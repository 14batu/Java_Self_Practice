package jd07_class_object_task;

public class ItemClients {
    public static void main(String[] args) {
        Item item = new Item();
        Item item1 = new Item();


        item.itemName = "Gb";
        item.quantity = 100;
        item.unitPrice = 10.5;

        double num = item.calcCost(item.unitPrice, item.quantity);
        System.out.println("num = " + num);

        System.out.println(item);

        item1.itemName = "apple";
        item1.quantity = 25;
        item1.unitPrice = 7.2;

        double num1 = item.calcCost(item1.unitPrice, item1.quantity);
        System.out.println("num1 = " + num1);

        System.out.println(item1);

    }

}
