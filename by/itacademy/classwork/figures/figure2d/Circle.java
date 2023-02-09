package by.itacademy.classwork.figures.figure2d;

public class Circle extends Figures2d{
    private int r;
    public Circle(int r) {
        this.r = r;

    }

    @Override
    protected int calculatedSquare() {
        if (s == 0) {
            s = (int) (Math.PI * r * r);
        }
        return s;
    }

}
