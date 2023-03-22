package by.itacademy.classwork.cargenerator;

public class Auto {
 private String carName;
 private static final String STRING_TEMPLATE = "%s : %s + %s";
    private int engineCapacity;
    private CarModel carModel;

    public Auto(String carName, CarModel value, int i) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return String.format(STRING_TEMPLATE, carName, carModel, engineCapacity);
    }
}
