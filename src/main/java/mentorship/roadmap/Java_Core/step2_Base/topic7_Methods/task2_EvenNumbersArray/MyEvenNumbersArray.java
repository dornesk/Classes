package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task2_EvenNumbersArray;

import java.util.Arrays;

public class MyEvenNumbersArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getEvenNumbers(5)));
    }

    public static int[] getEvenNumbers(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 2 * (i + 1);
        }

        return arr;
    }
}
