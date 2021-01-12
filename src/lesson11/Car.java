/*1) Создать собственное исключение
- Создать класс Car c полями (марка, скорость, цена), конструкторы (с
параметрами и default) гетеры-сетеры.
Создать метод старт в котором пытаетесь завести автомобиль. В методе старт
генерируете случайное число от 0 до 20, если полученное число оказалось
четным, то выбрасываете созданное ранее вами исключение и передаете его к
месту откуда вызывали метод старт. Если все хорошо и исключение не
вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой
завелся.*/
package lesson11;

import java.util.Random;

public class Car {
    private String mark;
    private int speed;
    private int cost;


    public Car() {
    }

    public Car(String mark, int speed, int cost) {
        this.mark = mark;
        this.speed = speed;
        this.cost = cost;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
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

    public void start(Car car) throws MyEngineException  {
        int random = new Random().nextInt(20);
        if (random % 2 == 0) {
            try {
                throw new MyEngineException("Uneven number, engine fails");
            } catch (MyEngineException e) {
                e.printStackTrace();
            }

        } else if (random != random % 2) {
            System.out.println(car + " engine revving");
        }
    }
}

