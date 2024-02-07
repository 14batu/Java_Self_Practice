package jday12_oop_practice_task;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0 ){
            System.err.println("Cannot be 0 or negative");
            System.exit(1
            );
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price < 0 ){
            System.err.println("Price cannot be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String toString() {

        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + (price != 0 ? price : "free") +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
