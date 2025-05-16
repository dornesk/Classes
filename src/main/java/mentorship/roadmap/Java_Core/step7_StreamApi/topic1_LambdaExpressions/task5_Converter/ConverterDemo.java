package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task5_Converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverterDemo {

    public static int[] convertArray(int[] array, Converter converter) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = converter.convert(array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] converted = convertArray(numbers, n -> n * n);

        System.out.println(Arrays.toString(converted));
    }
}
