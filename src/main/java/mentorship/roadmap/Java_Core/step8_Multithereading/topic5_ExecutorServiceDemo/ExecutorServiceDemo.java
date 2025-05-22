package mentorship.roadmap.Java_Core.step8_Multithereading.topic5_ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    static final int taskCount = 5;
    static final int threadPoolSize = 3;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(threadPoolSize); // создание пула потоков

        for (int i = 0; i < taskCount; i++) {
            final int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task №" + taskNumber + ", name of threadpool: " +
                        Thread.currentThread().getName());
            });
        }

        executor.shutdown(); // инициируем завершение работы пула потоков

        try { // ожидаем завершение задач в течение 10 секунд
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // принудительно завершаем задачи если они не завершены
                System.out.println("Not all tasks are completed within the time limit.");
            }
        } catch (InterruptedException e) {
            executor.shutdownNow(); // принудительно завершаем задачи в случае прерывания
            System.out.println("Thread was interrupted: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("All tasks have been completed succesfully.");
    }
}
