package lesson8.human.pants;

public class LegGings implements HPants {

    @Override
    public void putOn() {
        System.out.println("Put on leggings");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off leggings");
    }
}
