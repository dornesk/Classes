package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task2_SumWhileLoop;

public class MySumWhileLoop {

    public static void main(String[] args) {

        int n = 100;
        int i = 0;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}
