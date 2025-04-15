package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task3_ForEachSum;

public class MyForEachSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 6, 5, 25, 10};
        int sum = 0;

        for (int a : arr) {
            sum += a;
        }

        System.out.println(sum);
    }
}
