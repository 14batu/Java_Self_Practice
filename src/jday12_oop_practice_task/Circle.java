package jday12_oop_practice_task;
import java.lang.Math;

public class Circle {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius){
        if (radius <= 0 ){
            System.err.println("The radius cannot be zero or negative numbers");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * Math.PI;
    }

    public double calcPerimeter(){
        return (radius * Math.PI) * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius= " + radius +
                " area= " + calcArea() +
                " perimeter= " + calcPerimeter() +
                '}';
    }
}
