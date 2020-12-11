/* 2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/
package lesson2;
public class Lesson2_2 {
    public static void main(String[] args) {
        int amoeba = 1;
        for (int i = 0; i <= 24; i += 3) {
            amoeba *= 2;//increce count amoeba in 2 time, every 3 hours
            System.out.println("Count amoeba in  " + i + "-hour = " + amoeba);
        }
    }
}