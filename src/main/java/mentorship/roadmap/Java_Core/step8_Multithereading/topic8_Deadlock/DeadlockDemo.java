package mentorship.roadmap.Java_Core.step8_Multithereading.topic8_Deadlock;

public class DeadlockDemo {
    private static Object lock1 = new Object(); // объекты для синхронизации
    private static Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Захват потоком №1 замка lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Ожидание захвата потоком №1 замка lock2");
                synchronized (lock2) {
                    System.out.println("Захват потоком №1 замка lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Захват потоком №2 замка lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("Ожидание захвата потоком №2 замка lock1");
                synchronized (lock1) {
                    System.out.println("Захват потоком №2 замка lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
