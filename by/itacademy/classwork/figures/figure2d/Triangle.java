package by.itacademy.classwork.figures.figure2d;

import by.itacademy.classwork.figures.Cornered;

public class Triangle extends Figures2d implements Cornered {
    private int x;
    private int y;
    private int z;
    private final int countOfCorner = 3;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    @Override
    protected int calculatedSquare() {

        if (s == 0) {
            s = x + y + z;
        } return s;
    }

    @Override
    public int getCountOfCorners() {
        return countOfCorner;
    }
}
