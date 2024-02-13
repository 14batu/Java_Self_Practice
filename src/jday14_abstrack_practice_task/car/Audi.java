package jday14_abstrack_practice_task.car;

public class Audi extends Car implements AutoPark{


    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Audi auto park is working");
    }

    @Override
    public void star() {
        System.out.println("Audi is working");

    }

    @Override
    public void drive() {
        System.out.println("Audi is working");

    }
}
