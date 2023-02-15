package by.itacademy.classwork.collections;

import java.util.ArrayList;
import java.util.List;

public class MainBox {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(1, 2, 3));
        boxes.add(new Box(3, 4, 5));
        System.out.println(boxes);

        Box biggest = boxes.get(0);
        for (Box box : boxes) {
            if (biggest.volume() < box.volume()) {
                biggest = box;
            }
        }
        boxes.remove(biggest);
        System.out.println(boxes);
    }
}
