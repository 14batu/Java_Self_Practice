package jday14_abstrack_practice_task;

public class Toyota extends Car{
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void star() {

        System.out.println("Toyota is working");

    }

    @Override
    public void drive() {
        System.out.println("Toyota is Driving");

    }
}
