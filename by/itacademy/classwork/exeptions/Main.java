package by.itacademy.classwork.exeptions;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(some(10));
        System.out.println(some(-10));

    }
    public static  int some(int i) throws Exception {
        if (i > 0) {
            return i;
        } else {
            throw new Exception();
        }
    }
}
