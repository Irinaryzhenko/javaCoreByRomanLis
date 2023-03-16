package by.itacademy.classwork.collections;

import java.util.Objects;

public class Box2 {
    private final int x;
    private final int y;
    private final int z;

    public Box2(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }
    public int volume() {
        return  this.x * this.y * this.z;
    }

//    @Override
//    public int compareTo(Box2 o) {
//        return Integer.compare(this.volume(), o.volume());
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (! (o instanceof Box2)) {
            return false;
        }
        Box2 box = (Box2) o;
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





