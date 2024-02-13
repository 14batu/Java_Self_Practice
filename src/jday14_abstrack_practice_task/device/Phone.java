package jday14_abstrack_practice_task.device;

public abstract class Phone extends Device{

    private long call;
    private long text;

    public Phone(String brand, String model, Double price, String color, String size, boolean hasBattery, boolean hasPowerButton, long call, long text) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
        this.call = call;
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "call=" + call +
                ", text=" + text +
                '}';
    }

}
