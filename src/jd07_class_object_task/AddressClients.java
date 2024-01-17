package jd07_class_object_task;

public class AddressClients {
    public static void main(String[] args) {

        Address address = new Address();

        address.buildingNumber = 7925;
        address.city = "McLean";
        address.state = "VA";
        address.zipCode = 22012;
        address.street = "Jones Branch Dr";

        System.out.println(address);
    }
}
