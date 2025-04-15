package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task6_FactorialFor;

public class MyFactorialFor {

    public static void main(String[] args) {

        int n = 16;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
