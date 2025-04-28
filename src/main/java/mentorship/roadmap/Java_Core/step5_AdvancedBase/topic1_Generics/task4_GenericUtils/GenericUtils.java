package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task4_GenericUtils;

public class GenericUtils {

    public static <T extends Comparable<T>> T max(T a, T b) {

        return a.compareTo(b) > 0 ? a : b;
    }
}
