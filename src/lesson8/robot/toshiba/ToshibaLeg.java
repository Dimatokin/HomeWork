package lesson8.robot.toshiba;

import lesson8.robot.ILeg;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price){
        this.price = price;
    }
    public ToshibaLeg(){}

    @Override
    public void step(){
        System.out.println("Toshiba's leg to do step");
    }
    @Override
    public int getPrice(){
        return price;
    }
}
