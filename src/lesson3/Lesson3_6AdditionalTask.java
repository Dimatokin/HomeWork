/*6)Проверить, различны ли все элементы массива.*/

package lesson3;

import java.util.Arrays;

public class Lesson3_6AdditionalTask {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        boolean count = false;
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) ((Math.random() + 1) * 10);
            numbers[i] = random;
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (count == true) {
                break;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Not all elements different");
                    count = true;
                    break;
                }
            }
        }if(count==false) {
            System.out.println("All elements different");
        }
    }
}

