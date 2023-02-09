package by.itacademy.classwork.figures.figures3d;

import by.itacademy.classwork.figures.Cornered;

public class Cuboid extends Figure3d implements Ribred, Cornered {
    private final int countOfCorner = 8;
    private int a;
    private int b;
    private int c;
    private final int countOfRib = 12;

    public Cuboid (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double calculateVolume() {

        if (volume == 0 ) {
            volume = a * b * c;
        } return volume;

    }

    @Override
    public int getCountOfRib() {
        return countOfRib;
    }

    @Override
    public int getCountOfCorners() {
        return countOfCorner;
    }
}
