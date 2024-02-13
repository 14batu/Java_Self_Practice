package jday14_abstrack_practice_task.device;

public class DeviceShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone","15 Pro Max",1200.0,"Black","Large",true,true,123123123,123444444);
        System.out.println(iphone);
        iphone.downloadApp();

        Laptop laptop = new Laptop("Apple","Mackbook",3600.0,"Gray","14,5",true,true);
        System.out.println(laptop);
        laptop.turnOn();
    }
}
