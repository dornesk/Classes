package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task4_ArrayListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortedArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(17);
        list.add(8);
        list.add(99);
        list.add(23);

        //Collections.sort(list);
        list.sort(Comparator.naturalOrder());

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
