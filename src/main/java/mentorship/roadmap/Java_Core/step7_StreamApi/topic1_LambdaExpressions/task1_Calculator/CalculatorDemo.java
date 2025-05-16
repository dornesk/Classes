package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task1_Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator add = (int a, int b) -> (a + b); //лямбда-выражение для сложения чисел
        int result = add.operate(1,2);
        System.out.println("Результат сложения: " + result);
    }
}
