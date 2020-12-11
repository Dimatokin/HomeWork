/*8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.*/
package Lesson3;

import java.util.Arrays;

public class Lesson3_8 {
    public static void main(String[] args) {
        double[] array1 = new double[10];
        double[] array2 = new double[10];
        double[] array3 = new double[10];
        int countIntNum = 0;
        for (int i = 0; i < array1.length; i++) {
            int random = (int) (Math.random() * 8 + 1);
            array1[i] = random;
        }
        for (int i = 0; i < array2.length; i++) {
            int random = (int) (Math.random() * 8 + 1);
            array2[i] = random;
        }
        for (int i = 0; i < array3.length; i++) {
            double realNum = array1[i] / array2[i];
            array3[i] = realNum;
        }
        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array2) + "\n" + Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % array3[i] == 0 && array3[i] % 1 == 0) {
                countIntNum++;
            }
        }
        System.out.println("number of integers in array3: " + countIntNum);
    }
}
