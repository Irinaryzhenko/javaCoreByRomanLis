package by.itacademy.classwork.collections;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list);
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list);
    }
}
