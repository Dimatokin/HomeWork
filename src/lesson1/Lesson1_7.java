/*Задание 7.  В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.*/
package lesson1;
import java.util.Scanner;
public class Lesson1_7 {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Введите число программистов: ");
        int n = s.nextInt();
        if (n/10%10==2|n/10%10==3|n/10%10==4|n/10%10==1)
            System.out.println(n + " Программистов");
        else if (n%10==5|n%10==6|n%10==7|n%10==8|n%10==9|n%10==0)
            System.out.println(n + " Программистов");
        else if (n%10==2|n%10==3|n%10==4)
            System.out.println(n + " Программиста");
        else if (n%10==1)
            System.out.println(n + " Программист");

    }
}