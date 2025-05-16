package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task3_ArraySort;

import java.util.Arrays;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] words = {"Java", "Lambda", "Stream", "API"};

        /*сортируем массив строк с помощью компаратора,
        переопределенного через лямбда-выражение для сортировки по длине*/
        Arrays.sort(words, ((o1, o2) -> Integer.compare(o1.length(), o2.length())));

        System.out.println(Arrays.toString(words));
    }
}
