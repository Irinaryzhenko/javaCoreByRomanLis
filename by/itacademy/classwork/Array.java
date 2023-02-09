package by.itacademy.classwork;

import org.w3c.dom.ls.LSOutput;

public class Array {
    public static void main (String[] args) {
        int [] array;
        array = new int[5];
        // int [] array = new int[5]; массив на 5 ячеек

        // Начальная инициализация массива

        int [] arrays = {1, 45, 467, 90}; //размер массива изменить нельзя

         //Доступ к элементам в массиве

        System.out.println(array[0]);
        array[0] = 15;
        System.out.println(array[0]);

        System.out.println(array.length); //вызов размера массива

        String [] arr = {"new", "array"};
        System.out.println(arr);


        // массивы и циклы

        String[] arrayOfStrings = {"new", "array"};
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings[i]);
        }
        //найти маскимальное значение из массива
        int [] arrayOfNumbers = {1, 2, 3, 1, 4, 8, 9, 1, 0, -5, 8, 9, 0};
        int max = arrayOfNumbers[0]; //1
        for (int s = 1; s < arrayOfNumbers.length; s++) { //2элемент с индексом 1
            if (arrayOfNumbers[s] > max) {
                max = arrayOfNumbers[s];
            }

        }
        System.out.println(max);


         int min = arrayOfNumbers[0];
         for (int s = 1; s < arrayOfNumbers.length; s++) {
             if (arrayOfNumbers[s] < min) {
                 min = arrayOfNumbers[s];
             }
         }
        System.out.println(min);

        int sum = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sum = sum + arrayOfNumbers[i];
        }
        System.out.println(sum);

        //Многомерный массив
        int [] [] array1 = {
                {1, 2}, //array[0]
        {3, 4, 5} // array [1]

        };
        for (int l = 0; l < array1.length; l++) {
            for (int m = 0; m < array1[l].length; m++) {
                System.out.println(array1[l][m] + " ");
            }
            System.out.println();
        }
        int max1 = array1[0][0];
        for (int l = 0; l < array1.length; l++) {
            for (int m = 0; m < array1[l].length; m++) {
                if (array1[l][m] > max1) {
                    max1 = array1[l][m];
                }
            }
        }
            System.out.println(max1);


    }

}
