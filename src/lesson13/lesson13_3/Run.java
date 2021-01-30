/*3) Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению*/
package lesson13.lesson13_3;

import java.io.File;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        String text = "Трагедия, Пушкина, лоб, Моцарт, Сальери, занимает, всего, десять, страниц, чем, она, казак," +
                " дед, шалаш, комок, потоп, заказ.";
        String blackWords = "поп, лоб, топ.";

        FileCreatorAndWriteText fileCreatorAndWriteText = new FileCreatorAndWriteText();

        File originalText = fileCreatorAndWriteText.creatorFile(text, "originalText.txt");
        File blackList = fileCreatorAndWriteText.creatorFile(blackWords, "blackList.txt");

        Censorship censorship = new Censorship();
        try {
            censorship.checkForCensorship(originalText, blackList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
