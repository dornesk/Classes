package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task2_MapToSquare;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> square = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(square);
    }
}
