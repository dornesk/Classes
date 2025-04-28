package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils;

import java.util.Arrays;

public class ArrayUtilsDemo {

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4};

        System.out.println(Arrays.toString(a));
        ArrayUtils.swap(a, 0, 3);
        System.out.println(Arrays.toString(a));
    }
}
