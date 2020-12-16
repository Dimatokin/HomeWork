package lesson7;

public class GroundPassenger extends Ground {//Наземнный лекговой транспорт
    private String typeOfBody;//тип кузова
    private int countOfPassenger;//Кол-во пассажиров

    private double countOfKM;


    public GroundPassenger(int power, double maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, String typeOfBody, int countOfPassenger) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.typeOfBody = typeOfBody;
        this.countOfPassenger = countOfPassenger;
    }

    void countOfKM(double time) {// считаeт сколько километров проедет машина двигаясь с максимальной скоростью
        countOfKM = time * getMaxSpeed();
        System.out.println("За время " + time + " часа, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч проедет " + countOfKM + " км " + "и израсходует " + fullFuelConsumption(time) + " литров топлива");
    }

    private double fullFuelConsumption(double time) {
        return (getMaxSpeed() * time * getFuelConsumption()) / 100;
    }


    public double getCountOfKM() {
        return countOfKM;
    }

    public int getCountOfPassenger() {
        return countOfPassenger;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public void setCountOfKM(double countOfKM) {
        this.countOfKM = countOfKM;
    }

    public void setCountOfPassenger(int countOfPassenger) {
        this.countOfPassenger = countOfPassenger;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    String printCharacteristic() {
        return super.printCharacteristic() + ". Тип кузова = " + typeOfBody + ". Кол-во пассажиров = " + countOfPassenger + ". Мощность в киловаттах " + calculationKV;
    }
}
