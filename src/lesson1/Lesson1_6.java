/*Задание 6. Даны 2 числа. Вывести большее из них*/
package lesson1;
import java.util.Scanner;
public class Lesson1_6 {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Введите 2 числа : ");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
