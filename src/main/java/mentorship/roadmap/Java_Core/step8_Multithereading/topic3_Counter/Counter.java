package mentorship.roadmap.Java_Core.step8_Multithereading.topic3_Counter;

public class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
