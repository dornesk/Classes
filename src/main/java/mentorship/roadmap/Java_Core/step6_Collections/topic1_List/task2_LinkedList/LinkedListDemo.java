package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        list.addFirst("First");
        list.addLast("Last");

        for (String i : list) {
            System.out.println(i);
        }

        System.out.println();
        list.removeFirst();
        list.removeLast();

        for (String i : list) {
            System.out.println(i);
        }
    }
}
