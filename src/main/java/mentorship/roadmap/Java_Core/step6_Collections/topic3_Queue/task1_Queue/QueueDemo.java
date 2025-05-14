package mentorship.roadmap.Java_Core.step6_Collections.topic3_Queue.task1_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();
        q.offer("A");
        q.offer("B");
        q.offer("C");

        System.out.println(q.peek() + "\n");

        while (q.iterator().hasNext()) {
            System.out.println(q.poll());
        }
    }
}
