package jday14_abstrack_practice_task;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {

        if (make == null || make.isEmpty() || make.isBlank()) {
            throw new RuntimeException("Make cannot be null, empty or blank");
        }

        if (model == null || model.isBlank() || model.isEmpty()) {
            throw new RuntimeException("Model cannot be null, empty or blank");
        }

        if (year < 1886) {
            throw new RuntimeException("Year cannot be less than 1886.");
        }


        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price cannot be negative number.");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (color == null || color.isBlank() || color.isEmpty()) {
            throw new RuntimeException("Color cannot be null, empty or blank");
        }
        this.color = color;
    }

    public abstract void star();
    public abstract void drive();

    public void stop(){
        System.out.println("Stop works");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
