package jday14_abstrack_practice_task.car;

public class Honda extends Car{
    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void star() {
        System.out.println("Honda is working");

    }

    @Override
    public void drive() {
        System.out.println("Honda  is driving");

    }
}
