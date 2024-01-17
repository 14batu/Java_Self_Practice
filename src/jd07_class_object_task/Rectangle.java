package jd07_class_object_task;

public class Rectangle {

    double width;
    double length;

    public double calculateArea(double width, double length){

        return width * length;

    }
    public double calculatePerimeter(double width, double length){
        return (width + length) * 2;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
