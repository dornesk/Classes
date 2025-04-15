package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task1_AverageCalculator;

public class MyAverageCalculator {

    public static void main(String[] args) {
        double[] arr = {1, 2.3, 5.4};
        System.out.println(getAverage(arr));
    }

    public static double getAverage(double[] numbers) {

        double sum = 0;
        for (double n : numbers) {
            sum += n;
        }

        return sum / numbers.length;
    }
}
