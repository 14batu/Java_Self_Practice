package jday12_oop_practice_task;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);

    }

    public void setWidth(double width) {
        if (width <= 0){
            System.err.println("Cannot be 0 or negative number");
            System.exit(1);
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length <= 0){
            System.err.println("Cannot be 0 or negative number");
            System.exit(1);
        }
        this.length = length;
    }
    public double calcArea(){
        return width * length;
    }
    public double calcPerimeter(){
        return (width * length) * 2;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area= " + calcArea()+
                ", perimeter= " + calcPerimeter() +
                '}';
    }
}
