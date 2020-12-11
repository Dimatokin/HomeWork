/*7)Создайте массив из 12 случайных целых чисел из отрезка [0;15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.*/
package lesson3;

import java.util.Arrays;

public class Lesson3_7 {
    public static void main(String[] args){
        int [] numbers = new int[12];
        for (int i = 0; i <numbers.length ; i++) {
            int random = (int) (Math.random() * 15);
            numbers[i] = random;
        }
        System.out.println(Arrays.toString(numbers));
        int  max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
          max = Math.max(max,numbers[i]);
        }
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i]==max) {
                System.out.println("Index highest element: " + i);
            }
        }
    }
}
