package by.itacademy.classwork.lambda;

public class LambdaExpressions {
    public interface Movable {
        void move(String s);
    }
    public static void callMove(Movable m) {
        m.move("I can move!");
    }
    public static void main(String[] args) {
               callMove(new Movable() {
            @Override
            public void move(String s) {
                System.out.println(s);
            }
        });
    }
}
