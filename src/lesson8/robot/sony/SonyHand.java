package lesson8.robot.sony;

import lesson8.robot.IHand;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price){
        this.price = price;
    }
    public SonyHand(){
    }

    @Override
    public void upHand(){
        System.out.println("Lift sony's hand");
    }

    @Override
    public int getPrice(){
        return price;
    }

}
