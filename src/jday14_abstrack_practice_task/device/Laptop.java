package jday14_abstrack_practice_task.device;

public class Laptop extends Computer{
    public Laptop(String brand, String model, Double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is turned on");

    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is turned on");

    }
}
