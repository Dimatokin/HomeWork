package lesson8.human.jackets;

public class BomberJacket implements HJacket {

    @Override
    public void putOn() {
        System.out.println("Put on bomber jacket");
    }

    @Override
    public void takeOff() {
        System.out.println("Take off bomber jacket");
    }
}
