package by.itacademy.classwork.figures.figure2d;

import by.itacademy.classwork.figures.Cornered;

public class Box extends Figures2d implements Cornered {
    private int x;
    private int y;
     private final int countOfCorner = 4;

    public Box (int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    protected int calculatedSquare() {

        if (s == 0) {
            s = (int) (x * y);
        } return s;
    }

    @Override
    public int getCountOfCorners() {
        return countOfCorner;
    }
}
