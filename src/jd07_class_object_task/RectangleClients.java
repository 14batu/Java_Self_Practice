package jd07_class_object_task;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 =  new Rectangle();


        double num1 = rectangle.calculateArea(24,15);
        System.out.println("num1 = " + num1);

        double num2 = rectangle1.calculatePerimeter(15,25);
        System.out.println("num2 = " + num2);

    }
}
