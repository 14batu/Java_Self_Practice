package jday12_oop_practice_task;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;


    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()){
            System.err.println("Name cannot be blank or empty");
            System.exit(1);
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i))){
                System.err.println("The name cannot contain any special character or other than spca.");
                System.exit(1);
            }
            if (!Character.isLetter(name.charAt(0))){
                System.err.println("The name must starts with letter");
                System.exit(1);
            }
        }
        this.name = name;
    }

    public double getUnitPrice() {

        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {

        if(unitPrice < 0){
            System.err.println("unitPrice cannot be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.err.println("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public double calcCost(){
        return quantity * unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", calCost=" + calcCost() +
                '}';
    }
}
