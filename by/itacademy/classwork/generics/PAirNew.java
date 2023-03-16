package by.itacademy.classwork.generics;

public class PAirNew <K, V>{
    private final K left;
    private final V right;

    public PAirNew(K left, V right) {
        this.left = left;
        this.right = right;
    }
    public static <T, T1> PAirNew<T, T1> of (T left, T1 right) {
        return new PAirNew<>(left, right);
    }
    public static void main(String[] args) {
        PAirNew<String, Integer> pair = PAirNew.of("String", 12);
    }
}
