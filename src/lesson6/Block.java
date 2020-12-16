package lesson6;

public class Block {
    private String cpu, ram, hdd;
     int cycleOfWork = 4;
    int countBurned = 0;

    public Block(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void turnOn(int random1) {
        int error = (int) (Math.random() * 2);
        int turnon = (int) (Math.random() * 2);
        while (countBurned == 0 && cycleOfWork > 0) {
            if (error != random1) {
                System.out.println("Error computer burned.");
                countBurned++;
                cycleOfWork--;
            } else if (cycleOfWork > 0 && countBurned == 0 && random1 == turnon) {
                System.out.println(" Computer on.");
                cycleOfWork--;
                turnoff(random1);
            } else if (countBurned > 1 | cycleOfWork == 0 | random1 != turnon) {
                System.out.println("Computer burned.");
                countBurned++;
                cycleOfWork--;
            }
        }
    }

    public void turnoff(int random1) {
        int error = (int) (Math.random() * 2);
        int turnoff = (int) (Math.random() * 2);
        while (countBurned == 0 && cycleOfWork > 0) {
            if (error != random1) {
                System.out.println("Error, computer burned.");
                countBurned++;
                cycleOfWork--;
            } else if (random1 == turnoff) {
                System.out.println(" Computer off.");
                cycleOfWork--;
                turnOn(random1);
            } else if (cycleOfWork <= 0 || countBurned > 1 || random1 != turnoff) {
                System.out.println("Computer burned.");
                countBurned++;
                cycleOfWork--;
            }
        }
    }

    @Override
    public String toString() {
        return "System block: " + " CPU:" + cpu + " RAM:" + ram + " HDD:" + hdd;
    }
}
