package by.itacademy.classwork.exeptions;

public class Main1 {
    public static void main(String[] args) {
        try {
            System.out.println(some(10));
            System.out.println("done");
            System.out.println(some(-10));
        } catch (Exception e) {
            System.out.println("ERROR");
//            System.exit(-2); Блок finally не выполнится, принудительное завершение работы
        } finally {
            System.out.println("END");
        }
    }
    public static  int some(int i) throws Exception {
        if (i > 0) {
            return i;
        } else {
            throw new Exception();
        }
    }
}

