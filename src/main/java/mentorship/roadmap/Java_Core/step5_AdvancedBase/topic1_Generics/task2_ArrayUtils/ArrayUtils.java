package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils;

public class ArrayUtils {

    public static <T> void swap(T[] array, int i, int j) {
        T arr = array[i];
        array[i] = array[j];
        array[j] = arr;
    }
}
