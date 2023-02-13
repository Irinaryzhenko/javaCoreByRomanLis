package by.itacademy.classwork.generics;

public class Pair<T> {

    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T first() {
        return first;
    }
    public T last() {
        return last;
    }

    public void swap() {
        T temp = first;
        first = last;
        last = temp;


    }
    public void replaceFirst (T first) {
        this.first = first;
    }
    public void replaceLast(T last) {
        this.last = last;
    }

}

