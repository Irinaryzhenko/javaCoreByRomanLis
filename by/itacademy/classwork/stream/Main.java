package by.itacademy.classwork.stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, 2, 3, 4, 6, 7, 7, 9);
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE

//        for (Integer i: ints)  {
//            if (i < min) {
//                min = i;
//            }
//        }
        System.out.println(ints.stream().min(Integer::compareTo).get()); //поиск мин значения
        System.out.println(ints.stream().max(Integer::compareTo).get()); // поиск макс значения

        var sum  = ints.stream() // сумма всех числел
                .mapToInt(Integer ::intValue)
                .sum();
        System.out.println(sum);

        OptionalDouble avg = ints.stream() //среднее арифметическое
                .mapToInt(Integer ::intValue)
                .average();

        double result = avg.orElse(0);
        System.out.println(result);


        AtomicInteger integer = new AtomicInteger(1);
        ints.forEach(i -> integer.set(integer.get()* i));
        System.out.println(integer.get());

    }




}
