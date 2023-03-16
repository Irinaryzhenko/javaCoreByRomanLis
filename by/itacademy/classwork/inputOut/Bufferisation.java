package by.itacademy.classwork.inputOut;

import by.itacademy.classwork.collections.Box;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Bufferisation {
    private static final String FILE_NAME = "C:\\Users\\User\\Desktop\\JavaCorebyRomanLis\\JAvaCorebyRomanLis\\src\\by\\itacademy\\classwork\\inputOut\\test";

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Box(1,2,3));
        oos.close();

        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Box box = (Box)  ois.readObject();
        ois.close();
        System.out.println(box);

    }



}
