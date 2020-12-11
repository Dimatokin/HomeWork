/*2)	Найти среднее арифметическое элементов с нечетными номерами.
  4)	Найти наименьший нечетный элемент.
*/
package lesson3;

import java.util.Arrays;

public class Lesson3_2_4AdditionalTask {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double sumAllNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) ((Math.random() + 1) * 10);
            numbers[i] = random;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
            } else {
                sumAllNum = sumAllNum + numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Odd elements arithmetic mean " + sumAllNum / 2);
        System.out.println("*********************");
        Arrays.sort(numbers);
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println("Least element " + numbers[i]);
                        break;
            }
        }
    }
}

