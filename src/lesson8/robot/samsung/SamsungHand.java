package lesson8.robot.samsung;

import lesson8.robot.IHand;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price){
        this.price = price;
    }
    public SamsungHand(){}

    @Override
    public void upHand() {
        System.out.println("Lift Samsung's hand");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
