package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task2_InvalidAgeException;

public class AgeChecker {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Возраст задан некорректно (" + age + ")");
        }
    }

    public static void main(String[] args) {
        int years = 160;

        try {
            checkAge(years);
            System.out.println("Возраст: " + years);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка. " + e.getMessage());
        }
    }
}
