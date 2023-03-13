package by.itacademy.classwork.cars;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = CarUtils.generateCars(10);
        Map<Integer, List<Car>> byEngineCapacity = CarUtils.groupByEngineCapacity(cars);
        System.out.println(byEngineCapacity);

    }
}
