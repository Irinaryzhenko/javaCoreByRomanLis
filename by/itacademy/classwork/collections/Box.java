package by.itacademy.classwork.collections;

import java.util.Objects;

public class Box implements Comparable<Box>{
    private final int x;
    private final int y;
    private final int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }
    public int volume() {
        return  this.x * this.y * this.z;
    }

    @Override
    public int compareTo(Box o) {
        return Integer.compare(this.volume(), o.volume());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (! (o instanceof Box)) {
            return false;
        }
        Box box = (Box) o;
        return this.x == box.x
                && this.y == box.y
                && this.z == box.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}





