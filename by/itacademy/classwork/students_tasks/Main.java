package by.itacademy.classwork.students_tasks;

public class Main {
    public static void main(String[] args) {
        Student dima = new Student("Dmitry", 35, 76, Sex.MALE, 2);
        Student ira = new Student("Irina", 30, 60, Sex.FEMALE,2);
        dima.levelUp();
        ira.levelUp();
        System.out.println(dima);
        System.out.println(ira);
    }
}
