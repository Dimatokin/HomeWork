/*3)В исходном файле находятся слова, каждое слово на новой стороке. После запуска программы должен создать файл,
 который будет содержать в себе только полиндромы*/
package lesson10.lesson10_3;

import java.io.*;

public class Lesson10_3 {
    public static void main(String[] args) throws IOException {
        String[] text1 = {"Трагедия", "Пушкина", "Моцарт", "Сальери", "занимает", "всего", "десять", "страниц", "чем", "она",
                "казак", "дед", "шалаш", "комок", "потоп", "заказ"};

        File palindrome = new File("D:\\files\\Coding\\pro\\dev\\HomeWork\\src\\lesson10\\lesson10_3", "palindromeOnly.txt");

        if (!palindrome.exists()) {
            palindrome.createNewFile();
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }

        FileWriter fileWriter = new FileWriter(palindrome);

        for (int i = 0; i < text1.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(text1[i]);
            stringBuilder.reverse();
            if (stringBuilder.toString().equals(text1[i])) {
                fileWriter.write(text1[i] + "\n");
            }
        }
        fileWriter.close();
    }
}




