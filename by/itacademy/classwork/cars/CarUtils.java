package by.itacademy.classwork.cars;

import java.util.*;

public class CarUtils {
    private static final Random RANDOM = new Random();

    private CarUtils() {

    }

    public static List<Car> generateCars(int count) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String name = " " + i;
            int engineCapacity = RANDOM.nextInt(3) + 1;

            CarModel model = CarModel.values()[RANDOM.nextInt(3)];
            Car car = new Car(model, name, engineCapacity);
            cars.add(car);
        }
            return cars;
    }

    public static Map<Integer, List<Car>> groupByEngineCapacity(List<Car> cars) {
        Map<Integer, List<Car>> result = new HashMap<>();
        for (Car car : cars) {
            List<Car> fromMap = result.get(car.getEngineCapacity());
            if (fromMap == null) {
                fromMap = new ArrayList<>();
                result.put(car.getEngineCapacity(), fromMap);
            }
            fromMap.add(car);
        }
        return result;
    }
}
