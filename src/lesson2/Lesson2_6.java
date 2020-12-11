/*6)Напишите программу вывода всех четных чисел от 2 до 100 включительно*/
package lesson2;
public class Lesson2_6 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i <100 ; i+=2) {
            a+=2;
            System.out.println(a);
        }
    }
}