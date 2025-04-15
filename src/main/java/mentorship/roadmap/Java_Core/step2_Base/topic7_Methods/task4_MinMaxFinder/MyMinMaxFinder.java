package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task4_MinMaxFinder;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

public class MyMinMaxFinder {

    public static void main(String[] args) {

        int[] arr = {1, 4, 26, -3, 7};
        System.out.println(Arrays.toString(findMinMax(arr)));
    }

    public static int[] findMinMax(int[] numbers) {

        int min = MAX_VALUE;
        int max = 0;

        for (int n : numbers) {
            min = n <= min ? n : min;
            max = n >= max ? n : max;
        }

        return new int[]{min, max};
    }
}
