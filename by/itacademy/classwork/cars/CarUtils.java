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

            Model model = Model.values()[RANDOM.nextInt(3)];
            Car car = new Car(name, engineCapacity,model);
            cars.add(car);
        }
            return cars;
    }

    public static Map<Integer, List<Car>> groupByEngineCapacity(List<Car> cars) {
        Map<Integer, List<Car>> result = new HashMap<>();
        for (Car car : cars) {
            List<Car> fromMap = result.get(car.getENGINECAPACITY());
            if (fromMap == null) {
                fromMap = new ArrayList<>();
                result.put(car.getENGINECAPACITY(), fromMap);
            }
            fromMap.add(car);
        }
        return result;
    }
}
