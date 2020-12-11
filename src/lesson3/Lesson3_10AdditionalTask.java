/*10) Найти максимальный элемент в массиве и поменять его местами с нулевым элементом*/
package lesson3;

import java.util.Arrays;

public class Lesson3_10AdditionalTask {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int indexMax = 0;
        int zeroElement = 0;

        for (int i = 0; i < numbers.length; i++) {
            int random = (int) ((Math.random() + 1) * 10);
            numbers[i] = random;
        }
        System.out.println(Arrays.toString(numbers));
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                indexMax = i;
            }
        }
        System.out.println("Maximum element: " + max);
        zeroElement = numbers[0];
        numbers[0] = max;
        numbers[indexMax] = zeroElement;

        System.out.println("New array: " + Arrays.toString(numbers));

    }
}
