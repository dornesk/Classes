package mentorship.roadmap.Java_Core.step8_Multithereading.topic2_Runnable;

public class RunnableLambdaDemo {
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Task 1 is running");
        Runnable r2 = () -> System.out.println("Task 2 is running");
        Runnable r3 = () -> System.out.println("Task 3 is running");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все потоки завершены.");
    }
}
