/*7)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99*/
package lesson2;
public class Lesson2_7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 99; a += 2) {
            sum += a;
        }
        System.out.println("Total sum an odd numbers from 1 to 99 = " + sum + ".");
    }
}