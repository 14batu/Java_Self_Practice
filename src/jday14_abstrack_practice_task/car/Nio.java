package jday14_abstrack_practice_task.car;

public class Nio implements AutoPilot,AutoPark{
    @Override
    public void autoPark() {
        System.out.println("nio auto park is working");

    }

    @Override
    public void selfDrive() {
        System.out.println("Nio self-driving is working");

    }
}
