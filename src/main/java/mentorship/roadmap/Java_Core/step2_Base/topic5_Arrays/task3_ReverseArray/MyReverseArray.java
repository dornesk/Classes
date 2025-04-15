package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task3_ReverseArray;

public class MyReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 5, 25, 10};

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
    }
}
