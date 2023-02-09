package by.itacademy.classwork.figures.figures3d;

public class Sphere extends Figure3d{
    private int r;

    public Sphere(int r) {
        this.r = r;
    }

    @Override
    protected double calculateVolume() {

        if (volume == 0) {
            volume = 4 / 3 * (Math.PI * Math.pow(r, 3));
        }
        return volume;
    }
}
