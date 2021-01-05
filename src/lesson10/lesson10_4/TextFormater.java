package lesson10.lesson10_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFormater {

    public static int countsWords(String string) {
        int count = 0;
        Pattern pt = Pattern.compile(" ");//Отметили что нужно искать в тексте {пробелы чтобы разделить слова}
        Matcher matcher = pt.matcher(string.trim());
        while (matcher.find()) {//по мере прохождения цикла находим знак и увеличиваем значение count
            count++;
        }
        count++;// добавляем не достающее слово
        return count;
    }

    public static boolean checkPalindrome(String string) {
        String[] delim = string.trim().split(" ");
        String[] arrayWords = new String[delim.length];

        for (int i = 0; i < delim.length; i++) {
            arrayWords[i] = delim[i];
        }
        for (int i = 0; i < arrayWords.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(arrayWords[i]);
            sb.reverse();
            if (sb.toString().equals(arrayWords[i])) {
                return true;
            }
        }
        return false;
    }
}
