package by.itacademy.classwork;

import java.util.Arrays;
import java.util.Random;

public class TAsk {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int maxIndex = 0;
        int max = -300;
        int min = 300;
        for (int i = 0; i < numbers.length; i++) {
            int element = random.nextInt(601) - 300;
            if (element > max) {
                max = element;
                maxIndex = i;
            }
            if (element < min) {
                min = element;
            }
            numbers[i] = element;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        numbers[maxIndex] = min * max;
        System.out.println(Arrays.toString(numbers));
    }
}

