package lesson8.human.pants;

public class SweatPants implements HPants {

    @Override
    public void putOn() {
        System.out.println("Put on sweatpants");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off sweatpants");
    }

}
