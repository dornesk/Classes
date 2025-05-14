package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(3);
        n.add(1);
        n.add(20);

        for (Integer i : n) {
            System.out.println(i);
        }

        System.out.println();
        n.remove(Integer.valueOf(20));

        for (Integer i : n) {
            System.out.println(i);
        }
    }
}
