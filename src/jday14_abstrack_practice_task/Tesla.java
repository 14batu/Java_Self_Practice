package jday14_abstrack_practice_task;

public class Tesla implements AutoPark,AutoPilot{
    @Override
    public void autoPark() {
        System.out.println("Tesla auto park is working");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla self-driving is working");
    }
}
