package jday14_abstrack_practice_task.car;

public class CarClient {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("toyota","Focus",1993,100_000,"Black");
        System.out.println(toyota);
        toyota.drive();
        toyota.star();

        Tesla tesla = new Tesla("Tesla","a4",2021,35_000,"red");
        tesla.autoPark();


        Car car = new Honda("Honda","Civic",2022,45_000,"White");
        System.out.println(car);

        car.star();
        car.stop();

    }
}
