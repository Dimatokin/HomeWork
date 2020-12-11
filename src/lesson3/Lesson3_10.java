/*10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.*/
package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Lesson3_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter integer more than 3: ");
        int num = Integer.parseInt(bf.readLine());

        if (num > 3) {
            int[] firstArray = new int[num];
            for (int i = 0; i < firstArray.length; i++) {
                int random = (int) (Math.random() * 20);
                firstArray[i] = random;
            }
            System.out.println("Original array: " + Arrays.toString(firstArray));

            ArrayList<Integer> secondArray = new ArrayList<Integer>();
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] % 2 == 0) {
                    secondArray.add(firstArray[i]);
                }
            }
            System.out.println("Even number array: " + secondArray);
        } else {
            System.out.println("Number must be more than 3 ");
        }
    }
}
