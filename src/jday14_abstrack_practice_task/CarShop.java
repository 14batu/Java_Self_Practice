package jday14_abstrack_practice_task;

import jday14_abstrack_practice_task.car.Audi;
import jday14_abstrack_practice_task.car.Car;
import jday14_abstrack_practice_task.car.Honda;
import jday14_abstrack_practice_task.car.Tesla;

public class CarShop {
    public static void main(String[] args) {
        Car[] cars = {
                new Honda("Pilot","White", 2010, 25000,"Blue"),
                new Audi("Q6", "Red",2014, 32000,"Blue"),
                new Honda("Accord", "White",2011, 20000,"Black"  ),
                new Audi("Q4", "Blue", 2015, 33000,"Blue"),
                new Audi("A7", "Black",2019, 35000,"Blue"),
                new Audi("Q8", "White",2018, 40000,"Blue"),
                new Audi("Q5", "Purple",2009, 30000,"Blue"),
                new Audi("A4", "Black", 2011, 30000,"Blue"),
                new Honda("Civic", "Red",2018, 30000,"Red"),
                new Honda("CR-V", "Red", 2012, 23000,"Gray"),
                new Honda("HR-V", "Blue",2019, 35000,"Blue"),
                new Tesla("Model 3", "White", 2015, 45000,"Blue"),
                new Tesla("Model Y", "Black", 2017, 65000,"Blue"),
                new Tesla("Model X", "White", 2016, 48000,"Blue"),
                new Tesla("Model X", "Blue",2014, 48000,"Blue"),
        };

        for (Car car : cars) {
            if ((car instanceof Honda && (car.getYear() >= 2010 && car.getYear() <= 2011)) ||
                    (car instanceof Audi && (car.getYear() >= 2015 && car.getYear() <= 2019)) ||
                    (car instanceof Tesla && (car.getYear() >= 2015 && car.getYear() <= 2016))) {
                System.out.println(car.getMake() + "-" + car.getYear());
            }


        }

    }


}
