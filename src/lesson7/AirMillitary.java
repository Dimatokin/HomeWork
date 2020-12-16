package lesson7;

public class AirMillitary extends Air {//Воздушный военный транспорт
    private boolean ejectionSystem;//- Наличие системы катапультирования (true/false)
    private int countOfRocket;//- Кол-во ракет на борту

    public AirMillitary(int power, double maxSpeed, int weight, String brand, int wingspan, int MinimumRunwayLengthForTakeOff, boolean ejectionSystem, int countOfRocket){
        super(power, maxSpeed, weight, brand, wingspan, MinimumRunwayLengthForTakeOff);
        this.ejectionSystem = ejectionSystem;
        this.countOfRocket = countOfRocket;
    }
    public void shoot(int countOfRocket){
        if(countOfRocket>0){
            System.out.println("Ракета пошла…");
        }else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    public void eject(boolean ejectionSystem){
        if(true){
            System.out.println("Катапультирование прошло успешно");
        }else{
            System.out.println("У вас нет такой системы");
        }
    }

    public boolean getEjectionSystem() {
        return ejectionSystem;
    }

    public int getCountOfRocket() {
        return countOfRocket;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public void setCountOfRocket(int countOfRocket) {
        this.countOfRocket = countOfRocket;
    }

    @Override
    String printCharacteristic() {
        return super.printCharacteristic() + ". Наличие системы катапультирования " + ejectionSystem + ". Кол-во ракет на борту " + countOfRocket + ". Мощность в киловаттах " + calculationKV;
    }


}
