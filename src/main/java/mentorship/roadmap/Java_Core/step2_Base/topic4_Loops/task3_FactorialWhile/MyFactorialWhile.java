package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task3_FactorialWhile;

public class MyFactorialWhile {

    public static void main(String[] args) {

        int n = 5;
        int i = 1;
        int fact = 1;

        while (i < n + 1) {
            fact *= i;
            i++;
        }

        System.out.println(fact);
    }
}
