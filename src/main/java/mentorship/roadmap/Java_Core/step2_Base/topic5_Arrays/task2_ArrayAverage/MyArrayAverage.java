package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task2_ArrayAverage;

public class MyArrayAverage {

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 5, 25, 10};
        int sum = 0;

        for (int a : arr) {
            sum += a;
        }

        double average = (double) sum / arr.length;

        System.out.println(average);
    }
}
