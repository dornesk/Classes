package mentorship.roadmap.Java_Core.step4_OOP.topic10_Statics.task1_Counter;

public class Counter {

    private static int count;

    public Counter() {
        count++;
    }

    public static void getCount() {
        System.out.println("Значение счетчика: " + count);
    }
}
