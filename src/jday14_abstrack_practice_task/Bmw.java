package jday14_abstrack_practice_task;

public class Bmw extends Car{
    public Bmw(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void star() {
        System.out.println("Bmw is working");

    }

    @Override
    public void drive() {
        System.out.println("Bmw is Driving");

    }
}
