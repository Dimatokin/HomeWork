package lesson8.space;

public class SpacePort {
    public void launch(IStart start) throws InterruptedException {
        if (!start.systemsCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            start.engineStart();
            for (int i = 0; i < 11; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
            start.start();
        }

    }
}
