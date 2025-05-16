package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        list.addFirst("First");
        list.addLast("Last");

        printList(list);

        list.removeFirst();
        list.removeLast();

        printList(list);
    }

    static void printList(List<String> list) {
        if (list == null) {
            System.out.println("Список не должен быть null.");
        } else if (list.isEmpty()) {
            System.out.println("Список не должен быть пустым.");
        } else {
            for (String i : list) {
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
