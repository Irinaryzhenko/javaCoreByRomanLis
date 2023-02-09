package by.itacademy.classwork.students_tasks;

public class Student extends Man {
    private int graduate;

    public Student (String name, int age, double weight, Sex sex, int graduate) {
        super(name, age, weight, sex);
        this.graduate = graduate;
    }
    public void levelUp() {
        this.graduate++;
    }

    @Override
    public String toString() {
        return super.toString() + "graduate: " + " " + graduate;
    }
}
