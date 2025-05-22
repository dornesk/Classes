package mentorship.roadmap.Java_Core.step8_Multithereading.topic1_MyThread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread " + currentThread().getName() + " says: Hello from thread!");
    }
}
