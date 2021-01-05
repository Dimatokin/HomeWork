/*)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.
Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false
В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл*/
package lesson10.lesson10_4;

import java.io.*;
import java.util.*;

public class Lesson10_4 {
    public static void main(String[] args) throws IOException {
        String text = "Москвы тоже шалаш было слишком.После елочных коридоров казак она приезжим распахивалась как космос." +
                "Укутанные люди прыгали из вагонов.Через ров на платформу?Выгружали дед перехваченные липкой. Лентой сине-клетчатые" +
                " китайские баулы, хватали их обе!Перспектива была дымной, дымке приехавшим людям брезжили дворцы, замки высотки.";

        String[] delim = text.trim().split("\\.|\\?|\\!");
        // разбиваем текст на предложения и добавляем в список
        ArrayList<String> sentence = new ArrayList<>(Arrays.asList(delim));

        File appropriateSentence = new File("D:\\files\\Coding\\pro\\dev\\HomeWork\\src\\lesson10\\lesson10_4",
                "appropriateSentence.txt");
        if (!appropriateSentence.exists()) {
            appropriateSentence.createNewFile();
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
        FileWriter fileWriter = new FileWriter(appropriateSentence);

        for (int i = 0; i < sentence.size(); i++) {
            if (TextFormater.checkPalindrome(sentence.get(i))) {
                fileWriter.write(sentence.get(i) + "\n");
            } else if (TextFormater.countsWords(sentence.get(i)) > 3 && TextFormater.countsWords(sentence.get(i)) < 5) {
                fileWriter.write(sentence.get(i) + "\n");
            }
        }
        fileWriter.close();
    }
}
