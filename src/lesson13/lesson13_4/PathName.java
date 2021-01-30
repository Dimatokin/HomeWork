package lesson13.lesson13_4;

import java.io.File;

public class PathName {
    String separator = File.separator;

    public String PathNames() {
        return "D:" + separator + "files" + separator +
                "Coding" + separator + "pro" + separator + "dev" + separator + "HomeWork" + separator + "src"
                + separator + "lesson13" + separator + "lesson13_2" + separator + "SerializationFile.txt";
    }
}
