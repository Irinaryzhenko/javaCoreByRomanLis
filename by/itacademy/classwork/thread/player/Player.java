package by.itacademy.classwork.thread.player;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private Integer age;
    private boolean active;

    public Player(String name, Integer age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }
}
