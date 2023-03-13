package by.itacademy.classwork.inputOut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);
        System.out.println("You entered string: ");
        System.out.println(word.nextLine());
        System.out.println("You entered integer: ");
        System.out.println(word.nextInt());

        System.out.println("You entered float: ");
        System.out.println(word.nextFloat());
//        word.close(); завершение программы

    }
}
