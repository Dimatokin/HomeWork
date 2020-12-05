/*Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.*/
package Lesson2;
import java.util.Scanner;

public class Lesson2_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number A:");
        int a = s.nextInt();
        System.out.println("Enter the number B:");
        int b = s.nextInt();
        int sum = 0;
        s.close();
        for (int i = 0; i < a; i++) {
            sum += b;
        }
        System.out.println(a + "*" + b + "=" + sum);
    }
}