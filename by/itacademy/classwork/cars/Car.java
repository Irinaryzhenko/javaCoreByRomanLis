package by.itacademy.classwork.cars;

public class Car {
    private final String nameOfCar;
    private final int ENGINECAPACITY;
    private final Model MODEL;

    public Car(String nameOfCar, int ENGINECAPACITY, Model MODEL) {
        this.nameOfCar = nameOfCar;
        this.ENGINECAPACITY = ENGINECAPACITY;
        this.MODEL = MODEL;
    }

    public int getENGINECAPACITY() {
        return ENGINECAPACITY;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfCar='" + nameOfCar + '\'' +
                ", ENGINECAPACITY=" + ENGINECAPACITY +
                ", MODEL=" + MODEL +
                '}';
    }
}
