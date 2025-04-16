package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task6_PrimeChecker;

public class MyPrimeChecker {

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

    public static boolean isPrime(int number) {
        boolean isPrime;
        int count = 0;

        if (number > 1) { // первое условие проверки на простое число - оно должно быть >1
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++; // счетчик на кол-во делителей - у простого числа только два делителя
                }
            }
        }
        isPrime = count == 2; // если есть два делителя - true, остальное false
        return isPrime;
    }
}