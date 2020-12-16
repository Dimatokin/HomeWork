package lesson7;


abstract class Air extends Transport {//Воздушный транспорт
    private int wingspan;// - Размах крыльев (м)
    private int minimumRunwayLengthForTakeOff;//- Минимальная длина взлётно-посадочной полосы для взлёта(км)

    public Air(int power, double maxSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinimumRunwayLengthForTakeOff() {
        return minimumRunwayLengthForTakeOff;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setMinimumRunwayLengthForTakeOff(int minimumRunwayLengthForTakeOff) {
        minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
    }

    @Override
    String printCharacteristic() {
        return super.printCharacteristic() + ". Размах крыльев (м)" + getWingspan() + ". Минимальная длина взлётно-посадочной полосы для взлёта(км) " + getMinimumRunwayLengthForTakeOff();
    }
}