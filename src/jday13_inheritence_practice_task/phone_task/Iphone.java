package jday13_inheritence_practice_task.phone_task;

public class Iphone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public Iphone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            System.err.println("Brand cannot be null, empty or blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()){
            System.err.println("Brand cannot be null, empty or blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Price cannot be less than 0");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()){
            System.err.println("Brand cannot be null, empty or blank");
            System.exit(1);
        }
        this.color = color;
    }
    public void call(long phoneNumber){
        System.out.println("Calling the number " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Texting the number " + phoneNumber);
    }
    public void faceTime(long phoneNumber){
        System.out.println("Facetiming the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
