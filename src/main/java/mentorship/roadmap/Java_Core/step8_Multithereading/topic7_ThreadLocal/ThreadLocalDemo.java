package mentorship.roadmap.Java_Core.step8_Multithereading.topic7_ThreadLocal;

public class ThreadLocalDemo {
    private static ThreadLocal<Integer> counter = ThreadLocal.withInitial(() -> 0);
    final static int numberOfIncrements = 100;

    public static void main(String[] args) {

        Runnable task = () -> { // определение задачи, которая будет выполняться потоками
            for (int i = 0; i < numberOfIncrements; i++) {
                counter.set(counter.get() + 1);
            }
            System.out.println("Thread №" + Thread.currentThread().getName() + " , counter value: " + counter.get());
        };

        Thread t1 = new Thread(task, "1");
        Thread t2 = new Thread(task, "2");
        Thread t3 = new Thread(task, "3");

        t1.start();
        t2.start();
        t3.start();
    }

        /*
        for (int i = 0; i < numberOfThreads; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                int currentCounter = counter.get();

                for (int j = 0; j < numberOfIncrements; j++) {
                    currentCounter++;
                }
                counter.set(currentCounter);
                System.out.println("Thread №" + threadNumber + ", counter value: " + counter.get());
            });

            thread.start();
        }
    } */
}
