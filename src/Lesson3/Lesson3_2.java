/*Создаем массив из всех нечетных чисел от 1 до 99 , выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке.*/
package Lesson3;

public class Lesson3_2 {
    public static void main(String[] args) {
        int[] unevenNum = new int[50];
        int count = 1;
        for (int i = 0; i < unevenNum.length; i++) {
            if (count % 2 != 0) {
                unevenNum[i] = count;
                count++;
            } else if (count % 2 == 0) {
                count++;
                i--;
            }
        }
        for (int i = 0; i < unevenNum.length; i++) {
            System.out.print(unevenNum[i]+" ");
        }
        System.out.println();

        for (int i = 49; i < unevenNum.length ; i--) {
            if(i == -1){
                break;
            }
            System.out.print(unevenNum[i]+" ");
        }
    }
}
