public class ContinueBreak {
    public static void main (String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("5 * " + i + " = " + i * 5);
            i++;
        }
        for (int result = 1; result <=10; result++) {
            System.out.println(result * 5);

        }
         for (int num = 1; num <= 512; num = num * 2) {
             System.out.println(num);
         }

        System.out.println("Hello");
        System.out.print("hello");
        System.out.println();
        System.out.println("hello");



        for (int p = 0; p < 3; p++ ) {
            for (int g = 0; g < 5; g++) {
                System.out.print("*");
                if (g != 4) {
                    System.out.print(" ");
                }

            }
            System.out.println();


        }


    }

}


