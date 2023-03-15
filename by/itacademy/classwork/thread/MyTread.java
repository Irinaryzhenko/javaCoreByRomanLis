package by.itacademy.classwork.thread;

    public class MyTread implements Runnable {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException ignored) {}
            }
            System.out.println("Наш поток все");
        });
//        thread.start();
//        System.out.println("Главный поток все");

        thread.setDaemon(true);
        thread.start();
        thread.sleep(2000);
        System.out.println("Главный поток все");



    }


        @Override
        public void run() {

        }
    }



