package lesson13.lesson13_3;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Censorship {

    public void checkForCensorship(File fileWithOriginalText, File blackList) throws IOException {

        List<String> text = Files.readAllLines(Paths.get(fileWithOriginalText.getAbsolutePath())); //текст файла который передали
        List<String> censoredWords = Files.readAllLines(Paths.get(blackList.getAbsolutePath())); //текст файла цензурных слов

        StringTokenizer stringTokenizer1 = new StringTokenizer(text.get(0), " ,.:;!?\"");
        StringTokenizer stringTokenizer2 = new StringTokenizer(censoredWords.get(0), " ,.:;!?\"");

        ArrayList<String> textNew = new ArrayList<>();// текст разделенный по индексом
        ArrayList<String> censoredNew = new ArrayList<>();

        while (stringTokenizer1.hasMoreTokens()) {
            textNew.add(stringTokenizer1.nextToken());
        }
        while (stringTokenizer2.hasMoreTokens()) {
            censoredNew.add(stringTokenizer2.nextToken());
        }

        int countCensor = 0;
        for (String value : textNew) {
            for (String s : censoredNew) {
                if (value.equals(s)) {
                    System.out.println("The text wasn't censored in these places: " + value);
                    countCensor++;
                    break;
                }
            }
        }
        if (countCensor == 0) {
            System.out.println("The text was pass censor");
        }
    }
}
