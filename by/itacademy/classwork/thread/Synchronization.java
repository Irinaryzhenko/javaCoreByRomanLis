package by.itacademy.classwork.thread;

public class Synchronization {


    private static synchronized void printS() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "     " + "Inside print");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "    " + i);
        }
    }

    private static final Object OBJECT = new Object();

    private static void printSB() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "  " + "Inside print");
        synchronized (OBJECT) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "    " + i);
                Thread.sleep(500);
            }
        }
    }

    public static void main(String[] args) {


        Runnable r = () -> {
            try {
//                printS();
                printSB();

            } catch (InterruptedException e) {
            }
        };
        Thread one = new Thread(r);
        one.start();

        Thread two = new Thread(r);
        two.start();
        one.interrupt(); // прерывание потока при DeadLock
    }
}
