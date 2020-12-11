/* 8) Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.
 * 9) Найти наименьший элемент среди элементов с четными индексами массива */
package lesson3;

import java.util.Arrays;

public class Lesson3_8_9AdditionalTask {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) ((Math.random() + 1) * 80);
            numbers[i] = random;
        }
        System.out.println(Arrays.toString(numbers));
        int minNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                if (numbers[i] < minNum) {
                   minNum = numbers[i];
                }
            }
        }
        System.out.println("The smallest element among the elements with even array indexes: " + minNum);//наименьший элемент среди элементов с четными индексами массива

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length - 2]);//выводим следующий по величине за максимальным
    }
}
