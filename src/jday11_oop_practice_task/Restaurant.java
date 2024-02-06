package jday11_oop_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String name;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> Servers = new ArrayList<>();
    public ArrayList<Chef> Chefs = new ArrayList<>();

    public Restaurant(String name, String location, int numberOfStars) {
        this.name = name;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        Servers.add(server);
    }

    public void hireServer(Server[] servers){
        for (Server server : servers) {
            Servers.add(server);
        }

    }
    public void hireChef(Chef chef){
        Chefs.add(chef);
    }

    public void hireChef(Chef[] chefs){
        for (Chef chef : chefs) {
            Chefs.add(chef);
        }
    }
    public void terminateServer(int employeeID){
        Servers.removeIf(server -> server.employeeID == employeeID);
    }

    public void terminateChef(int employeeID){
        Chefs.removeIf(chef -> chef.employeeID ==employeeID);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", Servers=" + Servers +
                ", Chefs=" + Chefs +
                '}';
    }
}
