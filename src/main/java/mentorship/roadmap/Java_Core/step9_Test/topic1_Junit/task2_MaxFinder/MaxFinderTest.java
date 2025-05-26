package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task2_MaxFinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxFinderTest {
    private MaxFinder finder;

    @BeforeEach
    void setUp() {
        finder = new MaxFinder();
    }

    @Test
    void singleNumberArray() {
        Assertions.assertEquals(1, finder.findMax(new int[]{1}));
    }

    @Test
    void negativeNumbersArray() {
        Assertions.assertEquals(-1, finder.findMax(new int[]{-1, -2, -3}));
    }

    @Test
    void repeatedNumbersArray() {
        Assertions.assertEquals(-1, finder.findMax(new int[]{-1, -1, -1}));
    }

    @Test
    void emptyArray() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> finder.findMax(new int[]{}));
    }
}
