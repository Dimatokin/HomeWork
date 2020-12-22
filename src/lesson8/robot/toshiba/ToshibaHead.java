package lesson8.robot.toshiba;

import lesson8.robot.IHead;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price){
        this.price = price;
    }
    public ToshibaHead(){}

    @Override
    public void speak() {
        System.out.println("Hello it's Toshiba's Head");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
