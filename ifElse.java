public class ifElse {
    public static void main(String[] args) {
        double number = 10;

        if (number % 2 == 0) {

            System.out.println("yes");
        } else {
            System.out.println("no");
        }


         double digit = 10;

        if (digit <= 0) {
            System.out.println("Меньше либо равно 0");
        } else if (digit > 0 && digit <= 10) { // первая часть условия - излишняя проверка
            System.out.println(">0 И < 10");
        } else if (digit >10 && digit <= 1000) {
            System.out.println("> 10 и < 1000");
        } else if (digit > 1000) {   // можно убрать if и условие для последнего else
            System.out.println("Число больше 1000");
        }


        int weekDay= 7;

        if (weekDay == 1) {
            System.out.println("Monday");
        } else if (weekDay == 2) {
            System.out.println("Вторник");
        } else if (weekDay == 3) {
            System.out.println("Среда");
        } else if (weekDay == 4) {
            System.out.println("Четверг");
        } else if (weekDay == 5) {
            System.out.println("Пятница");
        } else if (weekDay == 6) {
            System.out.println("Суббота");
        } else if (weekDay == 7){
            System.out.println("Воскресенье");
        } else {
            System.out.println("Несуществующий день");
        }


        switch (weekDay) {
            case 1 :
                System.out.println("Понедельник");
                break;

            case 2 :
                System.out.println("Вторник");
                break;
            case 3 :
                System.out.println("Среда");
                break;
            case 4 :
                System.out.println("Четверг");
                break;
            case 5 :
                System.out.println("Пятница");
                break;
            case 6 :
            case 7 :
                System.out.println("Выходной");
                break;

            default:
                System.out.println("Не существующий день");
        }

        int monthDay = 7;
        switch (monthDay) {
            case 1 : // кейсы можно через запятую на 17 java
            case 2 :
            case 12 :
                System.out.println("Зима");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Весна");
                break;
            case 6 :
            case 7 :
            case 8 :

                System.out.println("Лето");
                        break;
            case 9 :
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Несуществующая пора");
        }





    }
}

