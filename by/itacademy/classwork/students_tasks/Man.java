package by.itacademy.classwork.students_tasks;

public class Man {
   private String name;
    private int age;
    private double weight;
    private Sex sex;

    public Man(String name, int age, double weight, Sex sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return String.format(
                "name: %s, age: %s, weight: %s, sex: %s",
                this.name,
                this.age,
                this.weight,
                this.sex);
    }

}
