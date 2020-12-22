package lesson8.human.shoes;

public class Sandals implements HShoes {

    @Override
    public void putOn() {
        System.out.println("Put on sandals");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off sandals");
    }
}
