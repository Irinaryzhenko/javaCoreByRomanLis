package by.itacademy.classwork.thread;

import java.util.LinkedList;

public class ProdCons {

    private static final Integer LIMIT = 5;
    private static final LinkedList<Integer> BUFFER = new LinkedList<>();
    private static volatile boolean consumer = true;
    private static volatile boolean producer = true;

    public static void produce() {
        try {
            int value = 0;
            while (producer) {
                synchronized (BUFFER) {
                    while (BUFFER.size() == LIMIT) {
                        BUFFER.wait();
                    }
                    Thread.sleep(500);
                    System.out.println("Producer produce: " + ++value);
                    BUFFER.add(value);
                    if (value == 30) {
                        producer = false;
                    }
                    BUFFER.notify();
                }
            }

        } catch (InterruptedException ignored) {}

    }

    private static void consume() {
        try {
            while (consumer) {
                synchronized (BUFFER) {
                    while (BUFFER.size() == 0) {
                        BUFFER.wait();
                    }
                    Thread.sleep(500);
                    Integer value = BUFFER.poll();
                    System.out.println("Consumer consumed: " + value);
                    if (value !=null && value == 30) {
                        consumer = false;
                    }
                    BUFFER.notify();
                }
            }

        } catch (InterruptedException ignored) {}
    }

    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Thread(ProdCons::produce);
        Thread consumer = new Thread(ProdCons::consume);
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
