package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task6_DigitSumCalculator;

public class DigitSumCalculator {
    public static int sumDigits(int number) {
        number = Math.abs(number); //берем число по модулю
        int sum = 0;

        while (number > 0) {
            sum += number % 10; // добавляем последнюю цифру к сумме
            number /= 10; // убираем последнюю цифру из числа
        }

        return sum;
    }
}
