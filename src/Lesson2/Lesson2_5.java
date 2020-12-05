/*5)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/
package Lesson2;
public class Lesson2_5 {
    public static void main(String[] args) {
        double n = 0;
        for (int i = 1; i <= 20; i++) {
            n += 2.54;
            System.out.println(n + " inches = " + i + " cm.");
        }
    }
}
