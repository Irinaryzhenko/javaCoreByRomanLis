package by.itacademy.classwork.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map  = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("one"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(
                    "key: " + entry.getKey() + " value:" +entry.getValue()

            );
        }
        System.out.println(map.keySet());
        System.out.println(map.values());

        map.remove("one");
        System.out.println(map);
    }
}
