package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task4_WordCounter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {
    @Test
    void normalText() {
        Assertions.assertEquals(3, WordCounter.countWords("q w e"));
    }

    @Test
    void textIsEmpty() {
        Assertions.assertEquals(0, WordCounter.countWords(""));
    }

    @Test
    void severalSpacesInARow() {
        Assertions.assertEquals(3, WordCounter.countWords("q    e r"));
    }

    @Test
    void tabsOrNewLines() {
        Assertions.assertEquals(3, WordCounter.countWords("q    e \n r"));
    }

    @Test
    void largeText() {
        String largeText = "word ".repeat(10000);
        Assertions.assertEquals(10000, WordCounter.countWords(largeText));
    }
}
