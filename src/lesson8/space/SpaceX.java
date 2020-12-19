package lesson8.space;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean systemsCheck() {
        int random = new Random().nextInt(10);
        if (random > 5) {
            System.out.println("Проверка прошла успешно шатла X");
            return true;
        } else {
            System.out.println("Проверка прошла не успешно шатла X");
        }
        return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла X");
    }
}
