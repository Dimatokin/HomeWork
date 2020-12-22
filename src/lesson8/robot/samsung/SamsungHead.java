package lesson8.robot.samsung;

import lesson8.robot.IHead;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price){
        this.price = price;
    }
    public SamsungHead(){}

    @Override
    public void speak() {
        System.out.println("Hello it's Samsung's Head");
    }

    @Override
    public int getPrice() {
        return price;
    }
}