package jd07_class_object_task;

public class Address {

    int buildingNumber;
    String street;
    String city;
    String state;
    int zipCode;

    public String toString(){
        return buildingNumber + " " + street + "\n" + city + " " + state + ", " + zipCode;
    }
}
