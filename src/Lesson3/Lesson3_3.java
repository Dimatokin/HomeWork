/*Создайте массив из 15 случайных целых чисел из отрезка[0;99]. Выведите массив на экран.
 * Подсчитайте сколько в массиве четных элементов и выведите это количество на экран на
 * отдельной строке.*/
package Lesson3;

public class Lesson3_3 {
    public static void main(String[] args) {
        int[] number = new int[15];

        for (int i = 0; i < number.length; i++) {
            int random = (int) (Math.random() * 99);
            number[i] = random;
            System.out.print(random + " ");
        }
        int countsEvenNum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                countsEvenNum++;
            }
        }
        System.out.println();
        System.out.println(countsEvenNum);
    }
}
