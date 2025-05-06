package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task5_Finally;

public class FinallyDemo {

    public static void main(String[] args) {
        System.out.println("Ресурс открыт.");

        try {
            int x = 10 / 0;
            System.out.println("Результат деления: " + x);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка в делении. " + e.getMessage());
        } finally {
            System.out.println("Ресурс закрыт.");
        }
    }
}
