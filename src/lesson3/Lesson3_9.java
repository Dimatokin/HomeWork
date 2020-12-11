/*9)Пользователь должен указать с клавиатуры положительное число, а программа должна создать массив указанного размера из случайных целых чисел из [0;15] и вывести его на экран в строку.
После этого программа должна определить и сообщить пользователю о том, сумма какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
Если пользователь введёт неподходящее число, то выдать соответствующее сообщение*/
package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lesson3_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter positive integer: ");
        int num = Integer.parseInt(bf.readLine());
        int sum1 = 0;
        int sum2 = 0;

        if (num > 0) {
            int[] numbers = new int[num];
            for (int i = 0; i < numbers.length; i++) {
                int random = (int) (Math.random() * 15);
                numbers[i] = random;
            }
            System.out.print("Original array: " + Arrays.toString(numbers));
            System.out.println();
            int[] myArray1Half = Arrays.copyOfRange(numbers, 0, numbers.length / 2);
            int[] myArray2Half = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);

            for (int i = 0; i < myArray1Half.length; i++) {
                sum1 = sum1 + myArray1Half[i];
            }
            for (int i = 0; i < myArray2Half.length; i++) {
                sum2 = sum2 + myArray2Half[i];
            }
            if (sum1 > sum2) {
                System.out.println("First half array more second");
            } else if (sum1 < sum2) {
                System.out.println("Second half array more first");
            } else {
                System.out.println("Both equals");
            }
        } else {
            System.out.println("Number not positive or not integer");
        }
    }
}
