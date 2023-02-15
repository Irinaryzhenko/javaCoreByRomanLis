package by.itacademy.classwork.collections;

import by.itacademy.classwork.students_tasks.Sex;

import java.sql.SQLOutput;
import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Box one = new Box(1, 2, 3);
        Box two = new Box(1, 2, 3);
        Box three = new Box(10, 12, 30);
        Set<Box> boxes = new LinkedHashSet<>();
        boxes.add(one);
        boxes.add(two);
        boxes.add(two);
        boxes.add(three);

        Set<Box> boxes1 = new TreeSet<>();
        boxes1.add(one);
        boxes1.add(two);
        boxes1.add(three);
        System.out.println(boxes);



//        Iterator<Box> boxIterator = boxes.iterator();
//        while (boxIterator.hasNext()) {
//            Box box = boxIterator.next();
//            if (box.equals(one)) {
//                boxIterator.remove();
//            }
//        }
//        System.out.println(boxes);
//
//        List<Integer> ints = new ArrayList<>();
//        ListIterator<Integer> iterator = ints.listIterator();
//
//        for (Box box : boxes) {
//            System.out.println(boxes);
//        }
//        Set<Integer> strings = new TreeSet<>();
//        ints.add(2);
//        ints.add(4);
//        ints.add(5);
//        System.out.println();

    }
}
