package lesson13.lesson13_4;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long SerialVersionUID = 1L;

    private String mark;
    private int speed;
    private double cost;

    public Car(String mark, int speed, double cost) {
        this.mark = mark;
        this.speed = speed;
        this.cost = cost;
    }

    public String getMark() {
        return mark;
    }

    public int getSpeed() {
        return speed;
    }

    public double getCost() {
        return cost;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", speed=" + speed +
                ", cost=" + cost +
                '}';
    }
}

