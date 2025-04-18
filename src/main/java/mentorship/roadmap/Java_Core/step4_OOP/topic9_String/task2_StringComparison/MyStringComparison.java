package mentorship.roadmap.Java_Core.step4_OOP.topic9_String.task2_StringComparison;

public class MyStringComparison {

    public static void main(String[] args) {

        String s1 = "111";
        String s2 = new String("111");

        System.out.println("Сравнение строк через == : " + (s1 == s2));
        System.out.println("Сравнение строк через equals : " + s1.equals(s2));
    }
}
