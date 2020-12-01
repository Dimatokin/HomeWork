/* Задание 4. Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
Задание 5. Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.*/
package Lesson1;
import java.util.Scanner;

public class Lesson1_4_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 3 числa:");
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < 3; i++) {
            int a = s.nextInt();
            if (a > 0)
                positive++;
            if (a < 0)
                negative++;
        }
        System.out.println("Положительных чисел: " + positive);
        System.out.println("Отрицательных чисел: " + negative);
    }
}