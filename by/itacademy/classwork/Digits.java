package by.itacademy.classwork;

import java.util.Random;

public class Digits {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        int z = random.nextInt(10);

        if (x > z) {
            System.out.println(x + y);
        } else {
            System.out.println(z);
        }
        double avg = (x + y + z) / 3.0;
        System.out.println(avg);

        }


    }

