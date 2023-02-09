package by.itacademy.classwork.figures.figures3d;

import by.itacademy.classwork.figures.Cornered;

public class Pyramide extends Figure3d implements Ribred, Cornered {
    private int a;
    private int b;
    private int c;
    private int h;
    private final int countOfCorner = 4;

    private final int countOfRib = 6;

    public Pyramide(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;

    }


    @Override
    protected double calculateVolume() {

        if (volume == 0) {
            volume = a + b + c;
        }
        return volume;
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
