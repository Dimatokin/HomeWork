/*6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.*/
package Lesson3;

import java.util.Arrays;

public class Lesson3_6 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) (Math.random() * 10);
            numbers[i] = random;
        }
        System.out.println(Arrays.toString(numbers));

        if (numbers[0] < numbers[1] && numbers[2] < numbers[3]) {
            System.out.println("This array is ever-increasing");
        }else{
            System.out.println("This array is not ever-increasing");
        }
    }
}
