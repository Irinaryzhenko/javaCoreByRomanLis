package by.itacademy.classwork.lambda;

public class LambdaExpressions2 {
    public interface Movable {
        void move(String s);
    }
//    public static void callMove(Movable m) {
//        m.move("I can move!");
//    }
    public static void main(String[] args) {
        Movable movable = s -> {
            System.out.println(s);

        };
        movable.move("HEY!");
        movable.move("Hello!");
            }
            public static void test(Movable m) {
        m.move("I love java");
            }
}
