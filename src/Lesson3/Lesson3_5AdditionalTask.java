/*5)«Сожмите» массив, выбросив из него каждый второй элемент.
«Освободившиеся» места массива заполните нулями.
*/
package Lesson3;

import java.util.Arrays;

public class Lesson3_5AdditionalTask {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i <numbers.length ; i++) {
            int random = (int) ((Math.random()+1) * 10);
            numbers[i] = random;
        }
        for (int i = 0; i < numbers.length ; i++) {
            if(i%2!=0){
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
