package by.itacademy.classwork.collections;

import java.util.Comparator;

public class BoxComparator implements Comparator<Box2> {
    @Override
    public int compare(Box2 o1, Box2 o2) {
        return Integer.compare(o1.volume(), o2.volume());
    }
}

