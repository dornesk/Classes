package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task2_StringModifier;

public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier str = (String s) -> (s.toUpperCase() + "!");
        String result = str.modify("qwerty");
        System.out.println(result);
    }
}
