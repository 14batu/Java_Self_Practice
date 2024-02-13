package jday14_abstrack_practice_task;

public class CydeoCar implements AutoPark,AutoPilot,Fylable{
    @Override
    public void autoPark() {
        System.out.println("Cydeo auto park is working");

    }

    @Override
    public void selfDrive() {
        System.out.println("Cydeo self-driving is working");

    }

    @Override
    public void fly() {
        System.out.println("Cydeo flying is working");

    }
}
