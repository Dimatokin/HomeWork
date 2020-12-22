package lesson8.robot.sony;

import lesson8.robot.ILeg;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price){
        this.price = price;
    }
    public SonyLeg(){}

    @Override
    public void step(){
        System.out.println("Sony's leg to do step");
    }

    @Override
    public int getPrice(){
        return price;
    }
}
