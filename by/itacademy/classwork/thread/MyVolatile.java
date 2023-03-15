package by.itacademy.classwork.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class MyVolatile {
    public static void main(String[] args) throws Exception {
        class Test{
           AtomicInteger i = new AtomicInteger(0);
            void increment() {
                for (int i = 0; i < 10; i++) {
                    this.i.incrementAndGet();
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException ignored) {}
                }
            }
        }
        Test test = new Test();
        Thread one = new Thread(test :: increment);
        Thread second = new Thread(test :: increment);
        one.start();        second.start();
        one.join();         second.join();
        System.out.println(test.i);
    }
}
