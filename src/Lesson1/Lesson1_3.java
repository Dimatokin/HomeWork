/* Задание 3. Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число.
 */
package Lesson1;
import java.util.Scanner;
public class Lesson1_3 {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число:");
        int n = s.nextInt();
        if (n>0)
            System.out.println(n+1);
        else if(n<0)
            System.out.println(n-2);
        else
            System.out.println(n+10);
    }
}
