/*Создайте массив из всех четных чисел  от 2 до 20 и выведите элементы массива на экран сначала в строку,
 * отделяя один элемент от другого пробелом , а затем в столбик(отделяя один элемент от другого началом новой строки).*/
package lesson3;

public class Lesson3_1 {
    public static void main(String[] args) {
        int[] evenNum = new int[10];
        int count = 2;
        for (int i = 0; i < evenNum.length; i++) {
            if (count % 2 == 0) {
                evenNum[i] = count;
                count++;
            } else if (count % 2 != 0) {
                count++;
                i--;
            }
        }
        for (int i = 0; i < evenNum.length; i++) {
            System.out.print(evenNum[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < evenNum.length; i++) {
            System.out.println(evenNum[i]);
        }

    }
}
