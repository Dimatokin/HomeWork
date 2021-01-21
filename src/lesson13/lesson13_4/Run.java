/*4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс.*/
package lesson13.lesson13_4;

import java.io.*;

public class Run {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String separator = File.separator;
        String pathName = new PathName().PathNames();

        Car car1 = new Car("toyota", 120, 13_000);

        File SerializationFileSer = new File("D:" + separator + "files" + separator + "Coding" + separator
                + "pro" + separator + "dev" + separator + "HomeWork" + separator + "src" + separator + "lesson13"
                + separator + "lesson13_2" + separator, "SerializationFile.txt");
        if (!SerializationFileSer.exists()) {
            SerializationFileSer.createNewFile();
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }

        //Serialization
        FileOutputStream fileOutputStream = new FileOutputStream(pathName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(car1);
        objectOutputStream.close();

        //Deserialization
        FileInputStream fileInputStream = new FileInputStream(pathName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car car = (Car) objectInputStream.readObject();
        System.out.println(car);
    }
}
