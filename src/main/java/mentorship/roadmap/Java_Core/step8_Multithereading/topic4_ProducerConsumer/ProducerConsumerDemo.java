package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumerDemo {
    static final int CAPACITY = 5;
    static List<Integer> buffer = new ArrayList<>();
    static Random random = new Random(); // для генерации случайного числа в producer

    public static void main(String[] args) {
        Object lock = new Object(); //объект для синхронизации

        Thread producer = new Thread(() -> {
                while (true) { //бесконечный цикл для генерации данных
                    synchronized (lock){ //синхронизация через объект для предотвращения состояния гонки
                        while (buffer.size() == CAPACITY) {
                            try {
                                lock.wait(); // поток ждет, если буфер заполнен
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        int value = random.nextInt(100);
                        buffer.add(value); // добавляет случайное число в буфер
                        System.out.println("Produced: " + buffer.get(buffer.size() - 1));
                        lock.notifyAll(); // уведомляет все потоки что задача завершена
                    }
                }
        });

        Thread consumer = new Thread(() -> {
            while (true) { //бесконечный цикл для потребления данных
                synchronized (lock) { // синхронизация через объект для предотвращения состояния гонки
                    while (buffer.isEmpty()) {
                        try {
                            lock.wait(); // поток ждет, если буфер пустой
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = buffer.remove(0); // извлекает первое число из буфера
                    System.out.println("Consumed: " + value);
                    lock.notifyAll(); // уведомляет все потоки что задача завершена
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
