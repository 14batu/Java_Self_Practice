package jday11_oop_practice_task;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(double width,double length,double unitPrice,boolean isPersian){

        double totalCost = (width * length) * unitPrice;

        if (isPersian){
            totalCost += 200;
        }
        return totalCost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalCost=" + calcCost(width,length,unitPrice,isPersian)+

                '}';
    }
}
