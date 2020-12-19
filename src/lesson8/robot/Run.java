/*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
package lesson8.robot;

import lesson8.robot.samsung.*;
import lesson8.robot.toshiba.*;
import lesson8.robot.sony.*;

public class Run {
    public static void main(String[] args) {
        IRobot robot_1 = new Robot(new SamsungHead(20), new SonyHand(25), new ToshibaLeg(30));
        robot_1.action();
        System.out.println(robot_1.getPrice() + " cost\n");

        IRobot robot_2 = new Robot(new SonyHead(34), new ToshibaHand(35), new SamsungLeg(21));
        robot_2.action();
        System.out.println(robot_2.getPrice() + " cost\n");

        IRobot robot_3 = new Robot(new ToshibaHead(23), new SamsungHand(33), new SonyLeg(18));
        robot_3.action();
        System.out.println(robot_3.getPrice() + "cost\n");

        int mostExpensive = Math.max(Math.max(robot_1.getPrice(), robot_2.getPrice()), robot_3.getPrice());
        System.out.println("Robot with prise " + mostExpensive + " the most expensive ");


    }
}
