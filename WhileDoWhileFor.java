public class WhileDoWhileFor {
    public static void main (String[] args){
        int i = 1;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        int n = 5;
        do {
            System.out.println("Sample : " + n);
            n--;
        } while (n > 0);

        for (int f = 0; f < 5; f++) {  // переменная  видна только в for, но и другие переменные видны в for
            System.out.println("Count is: " + f);
        }

    }
}
