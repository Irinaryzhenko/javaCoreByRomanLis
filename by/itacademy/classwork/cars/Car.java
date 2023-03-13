package by.itacademy.classwork.cars;

public class Car {
    private final String name;
    private final int engineCapacity;
    private final CarModel carModel;


    Car(CarModel carModel, String name, int engineCapacity) {
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.carModel = carModel;

    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", carModel=" + carModel +
                '}';
    }
}
