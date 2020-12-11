package lesson1;

/* Задание 1.В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
Например, "это однозначное положительное число". Достаточно будет определить, является ли число однозначным,
"двухзначным или трехзначным и более.
*/
import java.util.Scanner;

public class Lesson1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число до 7 знаков: ");
        int n = s.nextInt();
        if (n < 10 & n > 0) {
            System.out.println("В числе 1 цифра. " + " оно положительное");
        } else if (n < 100 & n > 0) {
            System.out.println("В числе 2 цифры. " + " оно положительное");
        } else if (n < 1000 & n > 0) {
            System.out.println("В числе 3 цифры. " + " оно положительное");
        } else if (n < 10_000 & n > 0) {
            System.out.println("В числе 4 цифры. " + " оно положительное");
        } else if (n < 100_000 & n > 0) {
            System.out.println("В числе 5 цифр. " + " оно положительное");
        } else if (n < 1_000_000 & n > 0) {
            System.out.println("В числе 6 цифр. " + " оно положительное");
        } else if (n < 10_000_000 & n > 0) {
            System.out.println("В числе 7 цифр. " + " оно положительное");
        } else if (n < 100_000_000 & n > 0) {
            System.out.println("В числе 8 цифр. " + " оно положительное");
        } else
            System.out.println(" Число " + n + " отрицательное ");
    }
}
