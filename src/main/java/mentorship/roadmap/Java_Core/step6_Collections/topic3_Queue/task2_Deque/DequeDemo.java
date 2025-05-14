package mentorship.roadmap.Java_Core.step6_Collections.topic3_Queue.task2_Deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

    public static void main(String[] args) {

        Deque<Integer> deq = new LinkedList<>();
        deq.add(2);
        deq.addFirst(10);
        deq.addLast(1);
        deq.addFirst(20);
        deq.addLast(12);
        deq.addFirst(30);
        deq.addLast(13);

        System.out.println(deq.pollFirst());
        System.out.println(deq.pollLast());
        System.out.println();

        for (Integer i : deq) {
            System.out.println(i);
        }
    }
}
