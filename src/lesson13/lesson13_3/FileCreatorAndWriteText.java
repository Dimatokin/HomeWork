package lesson13.lesson13_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreatorAndWriteText {

    public File creatorFile(String text, String nameFile) {
        FileWriter fileWriter = null;
        File newFile = new File(nameFile);

        // проверяем если ли такой файл
        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
                System.out.println("File created " + newFile.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + newFile.getName() + "\n********************");
        }
        // записываем в файл текст
        try {
            fileWriter = new FileWriter(newFile);
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return newFile;
    }
}
