package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task1_CountOccurrences;

public class MyCountOccurrences {

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 5, 25, 10};
        int x = 5;
        int count = 0;

        for (int n : arr) {
            count = n == x ? count + 1 : count;
        }

        System.out.println(count);
    }
}
