package lesson8.robot.toshiba;

import lesson8.robot.IHand;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price){
        this.price = price;
    }
    public ToshibaHand(){}


    @Override
    public void upHand() {
        System.out.println("Lift Toshiba's hand");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
