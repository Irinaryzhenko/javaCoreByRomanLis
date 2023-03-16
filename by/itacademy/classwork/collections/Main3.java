package by.itacademy.classwork.collections;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

    List<Box> boxes = new ArrayList<>();
    boxes.add(new Box(1, 2, 3));
    boxes.add(new Box(3, 4, 5));
    boxes.add(new Box(6, 8, 10));

        System.out.println(checkListContainsBoxWithValue(boxes, 3));


}

    public static boolean checkListContainsBoxWithValue(List<Box> boxes, int volume) {
        for (Box box : boxes) {
            if (volume == box.volume()) {
                return true;
            }
        }
        return false;
}


}
