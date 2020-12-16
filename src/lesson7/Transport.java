package lesson7;

abstract class Transport {
    private int power;//(в лошадиных силах)
    private double maxSpeed;//(км/ч)
    private int weight;//(кг)
    private String brand;
    public double calculationKV;

    String printCharacteristic(){
        return "Мощность л.с = " + getPower() + ". Максимальная скорость км/ч = " + getMaxSpeed() + ". Масса кг = " + getWeight() + ". Марка " + getBrand();
    }

    void calculationKV() {
        calculationKV = getPower() * 0.74;
    }

    public Transport(int power, double maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
