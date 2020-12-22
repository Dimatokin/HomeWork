package lesson8.human.jackets;

public class SweatShirt implements HJacket {
    @Override
    public void putOn() {
        System.out.println("Put on sweatshirt");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off sweatshirt");
    }
}
