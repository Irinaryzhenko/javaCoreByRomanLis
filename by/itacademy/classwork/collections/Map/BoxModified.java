package by.itacademy.classwork.collections.Map;

import java.io.Serializable;
import java.util.Objects;

public class BoxModified implements Comparable<BoxModified>, Serializable {
    private final int x;
    private final int y;
    private final int z;
    private final int weight;

    public BoxModified(int x, int y, int z, int weight) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.weight = weight;

    }
    public int volume() {

        return  this.x * this.y * this.z;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(BoxModified o) {
        return Integer.compare(this.volume(), o.volume());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (! (o instanceof BoxModified)) {
            return false;
        }
        BoxModified box = (BoxModified) o;
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
                ", weight=" + weight +
                '}';
    }
}






