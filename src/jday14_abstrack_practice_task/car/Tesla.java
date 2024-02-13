package jday14_abstrack_practice_task.car;

public class Tesla extends Car implements AutoPark,AutoPilot{
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla auto park is working");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla self-driving is working");
    }

    @Override
    public void star() {
        System.out.println("Tesla is working");

    }

    @Override
    public void drive() {
        System.out.println("Tesla is working");

    }
}
