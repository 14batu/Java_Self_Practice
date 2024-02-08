package jday13_inheritence_practice_task.phone_task;

public class PhoneClient {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","A11","Small",10_000,"Black");
        System.out.println(iphone);

        iphone.call(123123123);

        Nokia nokia = new Nokia("Nokia","N12","Large",1_000,"White");
        System.out.println(nokia);

        nokia.faceTime(333333221);

        Samsung samsung = new Samsung(" ","S10","Small",-1500,"Blue");
        System.out.println(samsung);
        samsung.text(11111223);


    }
}
