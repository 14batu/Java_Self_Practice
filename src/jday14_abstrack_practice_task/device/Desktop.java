package jday14_abstrack_practice_task.device;

public class Desktop extends Computer{
    public Desktop(String brand, String model, Double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop is turned on");

    }

    @Override
    public void turnOff() {
        System.out.println("Desktop is turned on");

    }
}
