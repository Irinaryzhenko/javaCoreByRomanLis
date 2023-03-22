package by.itacademy.classwork.cargenerator;


import by.itacademy.classwork.generics.Pair;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CarGeneratorTask {

    private static Random random = new Random();
    private int count;
    private String path;

    private static List<Auto> generateCars(int count) {
        List<Auto> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            var number = random.nextInt(3);
            cars.add(new Auto(String.valueOf(i), CarModel.values()[number], number + 1));

        }
//            String name = " " + i;
//            int engineCapacity = random.nextInt(3) + 1;
//
//            CarModel model = CarModel.values()[random.nextInt(3)];
//           Car car = new Car(model, name, engineCapacity);
//            cars.add(car);
//        }
        return cars;
    }

    public static void writeCarsToFile(List<Auto> cars, String path) throws Exception {
        Files.write(
                Path.of(path),
                cars.stream().map(Auto::toString).collect(Collectors.toList())
        );

    }

    public static List<Auto> filteringEngineCapacity(List<Auto> cars, int capacity) {
        return cars.stream()
                .filter(car -> car.getEngineCapacity() == capacity)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\User\\Desktop\\JavaCorebyRomanLis\\JAvaCorebyRomanLis\\src\\by\\itacademy\\classwork\\cargenerator\\out";
        var cars = CarGeneratorTask.generateCars(10);

        try {
            CarGeneratorTask.writeCarsToFile(CarGeneratorTask.filteringEngineCapacity
                            (CarGeneratorTask.generateCars(10), 2),
                    path);
        } catch (IOException e) {
            System.out.println("Error while write!");
        }
    }
}
