package jday14_abstrack_practice_task.device;

public abstract class Computer extends Device{
    public Computer(String brand, String model, Double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
}
