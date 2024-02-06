package jday11_oop_practice_task;

public class Pizza {

    public String size;
    public int numberOfCheeseToppings;
    public int numberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double cacCost(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        int sizeOfMoney = 0;
        if (size == "Small") {
            sizeOfMoney = 10;
        } else if (size == "Medium") {
            sizeOfMoney = 12;
        } else if (size == "Large") {
            sizeOfMoney = 14;
        } else {
            System.out.println("Wrong Input");
            sizeOfMoney = 0;
        }
        return sizeOfMoney + numberOfCheeseToppings + numberOfPepperoniToppings;

    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ",Total of cost=" + cacCost(size, numberOfCheeseToppings, numberOfPepperoniToppings) +
                '}';
    }
}
