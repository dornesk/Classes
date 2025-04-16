package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task7_Fibonacci;

public class MyFibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static int fibonacci(int n) {
        if (n <= 1) { //задаем базовый случай
            return n;
        } else { //задаем рекурсивный случай
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
