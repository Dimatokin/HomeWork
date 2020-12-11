/*4)Создайте массив из 20 случайных целых чисел из отрезка [0;20].
Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке.*/
package lesson3;

public class Lesson3_4 {
    public static void main(String[] args) {
        int[] number = new int[20];

        for (int i = 0; i < number.length; i++) {
            int random = (int) (Math.random() * 20);
            number[i] = random;
            System.out.print(random + " ");
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(number[i] + " ");
        }

    }
}