package lesson8.human.shoes;

public class Loafers implements HShoes {

    @Override
    public void putOn() {
        System.out.println("Put on loafers");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off loafers");
    }
}
