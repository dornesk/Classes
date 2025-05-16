package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(20);

        printArray(numbers);

        numbers.remove(Integer.valueOf(20));

        printArray(numbers);
    }

    static void printArray(List<Integer> list) {
        if (list == null) {
            System.out.println("Список не должен быть null.");
        } else if (list.isEmpty()) {
            System.out.println("Список не должен быть пустым.");
        } else {
            for (Integer i : list) {
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
