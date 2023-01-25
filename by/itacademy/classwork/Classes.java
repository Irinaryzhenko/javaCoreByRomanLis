package by.itacademy.classwork;

public class Classes {
    public static void main (String[] args) {

         //конструктор объекта

        final Box box = new Box(); //неизменный тип данных
        Box box2 = new Box();

        box.x = 5;
        box.z = 10;
        box.y = 10;

        System.out.println(box.x * box.y * box.z);
    }
}
