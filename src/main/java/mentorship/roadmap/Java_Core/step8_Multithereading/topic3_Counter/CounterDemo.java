package mentorship.roadmap.Java_Core.step8_Multithereading.topic3_Counter;

public class CounterDemo {
    public static void main(String[] args) {
        Counter c = new Counter();

        int numberOfIncrements = 100;
        int numberOfThreads = 3;

        Thread[] threads = new Thread[numberOfThreads]; //создаем массив потоков

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(() -> { //передаем метод через лямбда-выражение: (() -> {fori});
                for (int j = 0; j < numberOfIncrements; j++) {
                    c.increment();
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Все потоки завершены. Итоговое значение счетчика: " + c.getCount());
    }
}
