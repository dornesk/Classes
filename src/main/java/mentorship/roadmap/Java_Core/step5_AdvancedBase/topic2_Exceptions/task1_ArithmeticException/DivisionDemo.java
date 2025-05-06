package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task1_ArithmeticException;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            int division = a / b;
            System.out.println("Результат: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка, деление на ноль");
        }
    }
}
