package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.task1_HashMap;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {

        String[] arr = {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println("Значений " + s.getKey() + ": " + s.getValue());
        }
    }
}
