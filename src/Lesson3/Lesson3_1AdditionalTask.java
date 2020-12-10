/*1)Найти произведение элементов, кратных 3.*/
package Lesson3;

public class Lesson3_1AdditionalTask {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) ((Math.random() + 1) * 10);
            numbers[i] = random;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i == 9) {
                break;
            }
            if (numbers[i] * numbers[i + 1] % 3 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
