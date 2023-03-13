package by.itacademy.classwork.stream;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("a1", "a2", "a3", "b1", "b3", "c1", "c5");


//        strings.stream()                // убираем строки, содержащие 3
//                .filter(s -> !s.contains("3"))
//                .forEach(System.out::println);

        Comparator<Character> characterComparator = (o1, o2) -> {
            return Character.compare(o1, o2);

        };
        strings.stream()                                                // убираем строки, содержащие 3
                .filter(s -> !s.contains("3"))
                .sorted((o1, o2) -> {
           return Integer.compare(
                    Integer.valueOf(o1.charAt(1)),
                   Integer.valueOf(o2.charAt(1))
           );

        })
        .sorted((o1, o2) -> characterComparator
                .reversed()
                .compare(o1.charAt(0), o2.charAt(0))
   )

        .skip(1) //Отбросить 1 элемент

                .map(s -> s.toUpperCase(Locale.ROOT))  //метод производит действия с каждым элементом
                .collect(Collectors.toList());

        System.out.println(strings);
    }


}
