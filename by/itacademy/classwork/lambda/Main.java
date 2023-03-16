package by.itacademy.classwork.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2,3,4,6,7,7,9);


        ints.forEach(System.out::println);

        String s = "Hello";
        Map<Character, List<Character>> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            List<Character> characters = map.computeIfAbsent(c, k -> new ArrayList<>());
            characters.add(c);
            }

        }
    }
