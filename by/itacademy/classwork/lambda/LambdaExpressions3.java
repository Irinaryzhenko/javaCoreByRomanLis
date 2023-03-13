package by.itacademy.classwork.lambda;

public class LambdaExpressions3 {
    public interface Movable {
        void move(String s);
    }

    public static void main(String[] args) {
       test(System.out::println);  //метод референс
        }

            public static void test(Movable m) {

                m.move("I love java");
            }
}
