package mentorship.roadmap.Java_Core.step8_Multithereading.topic9_RaceCondition;

import static java.util.stream.IntStream.range;

public class RaceConditionDemo {
    private static int count = 0; // обычный счетчик
    private static int syncCount = 0; // синхронизированный счетчик
    private static int numberOfIncrements = 1000; // количество итераций

    public static void main(String[] args) {

        Thread t1 = createInc(numberOfIncrements);
        Thread t2 = createInc(numberOfIncrements);
        Thread t3 = createInc(numberOfIncrements);

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

        System.out.println("All tasks have been completed succesfully.");
        System.out.println("Counter volume: " + count);
        System.out.println("Synchronized counter volume: " + syncCount);
    }

    // метод для итерации обоих счетчиков
    private static Thread createInc(int amount) {
        return new Thread(() -> range(0, amount).forEach(i -> {
            count++;
            syncIncrement();
        })
        );
    }

    //синхронизированный метод для инкрементации счетчика
    private static synchronized void  syncIncrement() {
        syncCount++;
    }
}
