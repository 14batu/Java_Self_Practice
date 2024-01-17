package jd07_class_object_task;

public class Item {

    String itemName;
    double unitPrice;
    int quantity;

    double result;

    public double calcCost(double unitPrice, int quantity){
        return result = unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", result=" + result +
                '}';
    }
}
