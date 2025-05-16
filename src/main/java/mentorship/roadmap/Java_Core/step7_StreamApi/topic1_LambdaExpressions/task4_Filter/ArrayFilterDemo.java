package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task4_Filter;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilterDemo {

    public static void main(String[] args) {
        Integer[] numbers = {5, 12, 7, 20, 3};
        List<Integer> filtered = filterArray(numbers, n -> n > 10);

        System.out.println(filtered);
    }

    public static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T i : array) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
