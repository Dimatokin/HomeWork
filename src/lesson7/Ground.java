package lesson7;

abstract class Ground extends Transport {//Наземнный транспорт
    private int numberOfWheels;//количество колес
    private double fuelConsumption;//(л/100км)

    public Ground(int power, double maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    String printCharacteristic() {
        return super.printCharacteristic() + ". Количество колес " + getNumberOfWheels() + ". Расход на 100 км " + getFuelConsumption();
    }
}
