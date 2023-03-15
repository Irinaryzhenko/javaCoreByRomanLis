package by.itacademy.classwork.thread;

public class MyThread2 implements Runnable {
    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {}
            }
            System.out.println("Наш поток все");
        });

        thread.start();
        thread.join();
        System.out.println("Главный все");

    }
}
