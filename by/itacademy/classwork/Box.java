package by.itacademy.classwork;

public class Box {
    int x;
    int y;
    int z;

    final String  name = "Box"; //неизменные данные

    static final String MESSAGE_WELCOME = "Hello"; //неизменяемое поле

    Box() {
        System.out.println("Constructor created");
    }
}
