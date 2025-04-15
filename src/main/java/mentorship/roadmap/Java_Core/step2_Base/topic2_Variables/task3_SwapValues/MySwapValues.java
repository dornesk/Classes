package mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task3_SwapValues;

public class MySwapValues {
    public static void main(String[] args) {

        int x1 = 5;
        int x2 = 7;
        int swap;

        System.out.println("переменная 1: " + x1);
        System.out.println("переменная 2: " + x2);

        swap = x1;
        x1 = x2;
        x2 = swap;

        System.out.println("переменная 1 после обмена: " + x1);
        System.out.println("переменная 2 после обмена: " + x2);
    }
}
