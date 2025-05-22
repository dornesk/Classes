package mentorship.roadmap.Java_Core.step8_Multithereading.topic6_Interrupt;

public class InterruptDemo {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> { // создание потока выполняющего бесконечный цикл
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Работаю...");
                try {
                    Thread.sleep(500); // вывод сообщения через каждые 500мс
                } catch (InterruptedException e) { // регулярная проверка флага прерывания
                    Thread.currentThread().interrupt(); // при обнаружении прерывания завершает работу потока
                }
            }
        });

        worker.start();

        try {
            Thread.sleep(3000); // основной поток ждем 3 секунды и завершает рабочий поток
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        worker.interrupt();
        System.out.println("Поток завершен успешно.");
    }
}
