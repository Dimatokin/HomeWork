/*1)Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?*/
package Lesson2;

public class Lesson2_1 {
    public static void main(String[] args) {
        double km = 10;
        double sum = km;
        for (int i = 1; i <= 7 ; i++) {
            sum *= 1.1 ;//increase count km in day on 10%
            sum += km;//adds mileage in day
        }
        System.out.println(" The total way in 7 days is = " + sum + " km.");
    }
}