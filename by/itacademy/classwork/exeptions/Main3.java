package by.itacademy.classwork.exeptions;

public class Main3 {
    public static void main(String[] args) {

    }

    public static int method() {
        try {
            System.out.println(some(-10));
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static  int some(int i) throws Exception {
        if (i > 0) {
            return i;
        } else {
            throw new Exception();
        }
    }
}

