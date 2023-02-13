package by.itacademy.classwork.generics;

public class Main {
    public static void main(String[] args) {
        String testString = "Test";

        Holder<String> stringHolder = new Holder<>(testString);
        Holder<Integer> IntegerHolder = new Holder<>(23);

        stringHolder.setValue(testString);
        String str = stringHolder.getValue ();

        IntegerHolder.setValue(15);
        Integer i = IntegerHolder.getValue();

            }

    public static <T> void print(String value) {
        System.out.println(value);

    }
}
