package by.itacademy.classwork;

public class Operators {
    public static void main(String[] args){
      String message = "Hello" + " " + "world!";
      System.out.println(message);

      int one = 1;
      System.out.println(one++);
      System.out.println(one--);
      System.out.println(++one);
      System.out.println(--one);

      int ten = 10;
      ten++; // ten = ten + 1;

        System.out.println(-one);

        boolean bool = true;
        System.out.println(!bool);

        int number = 5;
        System.out.println(number / 2);

        int digit = 10;
        System.out.println(digit % 2);

        int num = 3;
        System.out.println(num - (-5)); //унарный оператор в скобках либо рядом с числом
        System.out.println(num - -3);

        System.out.println(5 == 5); //сравнение
        System.out.println(7 >= 10);
        System.out.println(7 != 10);

        byte b3 = 125;
        byte b4 = 125;
        System.out.println(b3);

        int b5 = b3 + b4; //расширяющееся преобразование

        char c = 'A' + 'B'; // два char -> char
        int d = 'A' + b4; // char + число -> int

        byte b6 = 127;
        byte b7 = 1;
        byte newb = (byte) (b6 + b7); //сужающее преобразование (по умолчанию это был бы int c потерей данных


      System.out.println(newb);

      System.out.println(5 / 2d); //точный результат

      System.out.println(5 / 2); //округляет до целых

      System.out.println(5 > 10 && 1 < 2d);
      System.out.println(5 < 10 && 1 < 2d);
      System.out.println(5 >10 || 1 < 2d && true);

      System.out.println(5 << 2); // число, оператор сдвига и количество битов

      //тернарный оператор
      int result = 2 > 5 ? 2 : 5; //выражение ? результат возвращен если true: еслі false
      System.out.println(result);

      double res = 2 > 5  ? 2.0 : 8.5;
      System.out.println(res);
















    }
}
