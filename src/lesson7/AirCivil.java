package lesson7;

public class AirCivil extends Air {//Воздушный гражданский транспорт
    private int capacityOfPassenger;//Вместимость пассажиров
    private boolean businessClass;//- Наличие бизнес класса (true/false)

    private int countOfPassenger;//Количество пасажиров

    public AirCivil(int power, double maxSpeed, int weight, String brand, int wingspan, int MinimumRunwayLengthForTakeOff, int capacityOfPassenger, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, MinimumRunwayLengthForTakeOff);
        this.capacityOfPassenger = capacityOfPassenger;
        this.businessClass = businessClass;
    }

    public void capacityOfPassengerCivil(int countOfPassenger) {
        if (countOfPassenger > capacityOfPassenger) {
            System.out.println("Вам нужен самолет побольше.");
        } else {
            System.out.println("Самолет загружен");
        }
    }

    public int getCountOfPassenger() {
        return capacityOfPassenger;
    }

    public boolean getBusinessClass() {
        return businessClass;
    }

    public void setCountOfPassenger(int countOfPassenger) {
        this.capacityOfPassenger = countOfPassenger;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    String printCharacteristic() {
        return super.printCharacteristic() + ". Вместимость пассажиров " + capacityOfPassenger + ". Наличие бизнес класса " + businessClass + ". Мощность в киловаттах " + calculationKV;
    }
}
