package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task1_DivisionCalculator;

public class DivisionCalculator {
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is prohibited");
        } else {
            return (double) a / b;
        }
    }
}
