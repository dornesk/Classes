package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task4_CountEvenNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        System.out.println(numbers.stream().filter(n -> n % 2 == 0).count());
    }
}
