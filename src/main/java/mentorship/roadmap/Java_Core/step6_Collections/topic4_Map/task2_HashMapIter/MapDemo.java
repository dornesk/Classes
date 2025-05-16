package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.task2_HashMapIter;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 85);
        students.put("Bob", 72);
        students.put("Charlie", 90);
        students.put("Diana", 68);

        for (Map.Entry<String, Integer> s : students.entrySet()) {
            if (s.getValue() > 75) {
                System.out.println(s.getKey());
            }
        }
    }
}
