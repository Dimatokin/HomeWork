package lesson6;

public class Block {
    private String CPU, RAM, HDD;
    static int CycleOfWork = 4;
    static int countBurned = 0;

    public Block(String CPU, String RAM, String HDD) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public static int turnOn(int random1) {
        int error = (int) (Math.random() * 2);
        int turnon = (int) (Math.random() * 2);
        while (countBurned == 0 && CycleOfWork > 0) {
            if (error != random1) {
                System.out.println("Error computer burned.");
                countBurned++;
                CycleOfWork--;
            } else if (CycleOfWork > 0 && countBurned == 0 && random1 == turnon) {
                System.out.println(" Computer on.");
                CycleOfWork--;
                turnoff(random1);
            } else if (countBurned > 1 | CycleOfWork == 0 | random1 != turnon) {
                System.out.println("Computer burned.");
                countBurned++;
                CycleOfWork--;
            }
        }
        return random1;
    }

    public static int turnoff(int random1) {
        int error = (int) (Math.random() * 2);
        int turnoff = (int) (Math.random() * 2);
        while (countBurned == 0 && CycleOfWork > 0) {
            if (error != random1) {
                System.out.println("Error, computer burned.");
                countBurned++;
                CycleOfWork--;
            } else if (random1 == turnoff) {
                System.out.println(" Computer off.");
                CycleOfWork--;
                turnOn(random1);
            } else if (CycleOfWork <= 0 || countBurned > 1 || random1 != turnoff) {
                System.out.println("Computer burned.");
                countBurned++;
                CycleOfWork--;
            }
        }
        return random1;
    }

    @Override
    public String toString() {
        return "System block: " + " CPU:" + CPU + " RAM:" + RAM + " HDD:" + HDD;
    }
}
