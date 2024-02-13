package jday14_abstrack_practice_task.device;

public class google extends Phone implements Downloadable,AndroidApps{
    public google(String brand, String model, Double price, String color, String size, boolean hasBattery, boolean hasPowerButton, long call, long text) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton, call, text);
    }

    @Override
    public void turnOn() {
        System.out.println("Google is turned on");

    }

    @Override
    public void turnOff() {
        System.out.println("Google is turned on");

    }

    @Override
    public void downloadApp() {
        System.out.println("Google is turned on");

    }
}
