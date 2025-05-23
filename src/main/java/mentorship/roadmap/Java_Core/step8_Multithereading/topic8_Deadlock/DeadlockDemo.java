package mentorship.roadmap.Java_Core.step8_Multithereading.topic8_Deadlock;

public class DeadlockDemo {
    public static void main(String[] args) {
        Object lock1 = new Object(); // объекты для синхронизации
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Захват потоком №1 замка lock1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println("Захват потоком №1 замка lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Захват потоком №2 замка lock2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println("Захват потоком №2 замка lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
