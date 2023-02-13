package by.itacademy.classwork.generics;

public class Storage <T>{
    private T[] array;
    public Storage(T[] array) {
        this.array = array;
    }
    public T getByIndex(int index) {
        return array[index];

    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] {
                1, 2, 3
        };
        Storage<Integer> arrayHolder = new Storage<>(array);
        Integer element = arrayHolder.getByIndex(2);
        System.out.println(element);
        }
    }
