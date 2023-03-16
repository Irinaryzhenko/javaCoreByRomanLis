package by.itacademy.classwork.collections.Map;

import java.util.HashMap;
import java.util.Map;


public class Main2 {
    public static void main(String[] args) {
        System.out.println(getNumberCount(new int[]{1, 2, 3, 4, 3, 3}));
    }

    public static Map<Integer, Integer> getNumberCount(int[] numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i : numbers) {
            Integer current = result.get(i);
            if (current == null) {
                result.put(i,1);
            } else
             result.put(i, ++current);
            }

        return result;

    }
}
