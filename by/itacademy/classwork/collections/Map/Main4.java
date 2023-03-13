package by.itacademy.classwork.collections.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        List<BoxModified> boxes = new ArrayList<>();
        boxes.add(new BoxModified(1,2,3,100));
        boxes.add(new BoxModified(1,2,2, 10));
        boxes.add(new BoxModified(1,2,3,10));
        boxes.add(new BoxModified(1,8,3,50));
        boxes.add(new BoxModified(1,9,3, 30));
        boxes.add(new BoxModified(1,9,3, 2));
        boxes.add(new BoxModified(1,9,3, 30));

        Map<Integer, Map<Integer, List<BoxModified>>> map = boxes //группировка по объему и весу
                .stream()
                .collect(
                        Collectors.groupingBy(
                                BoxModified ::volume,
                                Collectors.groupingBy(BoxModified::getWeight)
                )
                );
        List<BoxModified> modified = boxes.stream().filter(boxModified -> boxModified.volume() == 6)
                        .collect(Collectors.toList());

        List<BoxModified> modified2 = boxes.stream()
                .filter(boxModified -> boxModified.getWeight() == 10 && boxModified.volume()==6)
                        .collect(Collectors.toList());

        long count = boxes.stream()
                .filter(boxModified -> boxModified.getWeight() > 10)
                .count();


        long weight = boxes.stream()
                .mapToInt(boxModified -> boxModified.getWeight())
                        .sum();
        long volume = boxes.stream()
                        .filter(boxModified -> boxModified.getWeight() < 100)
                                .mapToInt(BoxModified::volume)
                                        .sum();

        System.out.println(map);

    }
}





