package mentorship.roadmap.Java_Core.step4_OOP.topic9_String.task3_StringPoolDemo;

public class MyStringPoolDemo {

    public static void main(String[] args) {

        String s1 = "111";
        String s2 = "111";

        System.out.println("Обе строки указывают на один объект: " + (s1 == s2));
    }
}
