package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeMap;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(50);
        set.add(40);
        set.add(60);
        set.add(20);

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
