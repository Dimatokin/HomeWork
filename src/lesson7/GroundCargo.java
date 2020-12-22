package lesson7;

class GroundCargo extends Ground {//Наземнный грузовой транспорт
    private int payload;//- Грузоподъёмность(кг)
    private int weightCargo;// вес груза

    public GroundCargo(int power, double maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, int payload) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.payload = payload;
    }

    public void payloadCargo(int weightCargo) {
        if (weightCargo > payload) {
            System.out.println("Вам нужен грузовик побольше.");
        } else {
            System.out.println("Грузовик загружен");
        }
    }

    public int getPayload() {
        return payload;
    }

    public int getWeightCargo() {
        return weightCargo;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public void setWeightCargo(int weightCargo) {
        this.weightCargo = weightCargo;
    }

    @Override
    String printCharacteristic() {
        return super.printCharacteristic() + ". Грузоподъёмность(кг) " + payload + ". Мощность в киловаттах " + calculationKV;
    }
}