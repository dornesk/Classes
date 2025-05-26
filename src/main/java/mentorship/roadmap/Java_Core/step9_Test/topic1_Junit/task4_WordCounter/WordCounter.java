package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task4_WordCounter;

public class WordCounter {

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        } else {
            return text.trim().split("\\s+").length;
        }
    }

}
