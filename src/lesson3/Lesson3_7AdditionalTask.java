/*7)Подсчитать, сколько раз встречается элемент с заданным значением.*/
package lesson3;

import java.util.Arrays;

public class Lesson3_7AdditionalTask {
    public static void main(String[] args) {
        int givenElement = 4;
        int countOfElements = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length ; i++) {
            int random = (int) (Math.random() * 10);
            numbers[i] = random;
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]==givenElement){
                countOfElements++;
            }
        }
        System.out.println("Number of matches with the item " + countOfElements);
    }
}
