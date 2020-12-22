package lesson8.robot.samsung;

import lesson8.robot.ILeg;

public class SamsungLeg implements ILeg {
    private int price;
    public SamsungLeg(int price){
        this.price = price;
    }
    public SamsungLeg(){}

    @Override
    public void step() {
        System.out.println("Samsung's leg to do step");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
