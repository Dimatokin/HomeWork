/*3)Вычислить: 1+2+4+8+...+256)*/
package Lesson2;
public class Lesson2_3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int num = 1; num <= 256; num *= 2) {
            sum += num;
        }
        System.out.println("The total sum is = " + sum);
    }
}
