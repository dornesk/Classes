package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task1_ForEachPositive;

public class MyForEachPositive {

    public static void main(String[] args) {

        int[] arr = {1, -2, 0, -6, 5, 25, -10};

        for (int a : arr) {
            System.out.print(a > 0 ? a + " " : "");
        }
    }
}
