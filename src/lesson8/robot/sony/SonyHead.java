package lesson8.robot.sony;

import lesson8.robot.IHead;

public class SonyHead implements IHead {
    private int price;

    public SonyHead (int price){
        this.price = price;
    }
    public SonyHead(){
    }

    @Override
    public void speak() {
        System.out.println("Hello it's sony's Head");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
