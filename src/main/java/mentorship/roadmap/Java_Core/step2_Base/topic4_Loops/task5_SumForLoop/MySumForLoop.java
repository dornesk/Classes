package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task5_SumForLoop;

public class MySumForLoop {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
