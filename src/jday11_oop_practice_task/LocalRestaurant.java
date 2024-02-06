package jday11_oop_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Batuhan","Columbia",5);

        Server[] servers = {
                new Server("Alice",1,15.00,true),
                new Server("Batu",2,7.23,false)
        };

        Chef[] chefs = {
                new Chef("Tacettin",1,40.00,true),
                new Chef("Zufliye",2,32.50,false)
        };

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        restaurant.hireServer(new Server("Zeytin",3,12.00,false));
        restaurant.hireChef(new Chef("Muhtar",3,76.00,true));

        System.out.println(restaurant);

    }
}
