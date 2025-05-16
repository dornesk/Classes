package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task5_MinString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("elephant", "cat", "hippopotamus", "dog", "lion");

        Optional<String> minString = animals.stream()
                .min(Comparator.comparingInt(String::length));

        minString.ifPresent(str -> System.out.println("Строка с минимальной длинной: " + str));
    }
}
