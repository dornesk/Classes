package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task6_DigitSumCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitSumCalculatorTest {
    @Test
    void singleNumber() {
        Assertions.assertEquals(1, DigitSumCalculator.sumDigits(1));
    }

    @Test
    void multidigitNumber() {
        Assertions.assertEquals(2, DigitSumCalculator.sumDigits(11));
    }

    @Test
    void negativeNumber() {
        Assertions.assertEquals(2, DigitSumCalculator.sumDigits(-11));
    }

    @Test
    void nullNumber() {
        Assertions.assertEquals(0, DigitSumCalculator.sumDigits(0));
    }
}
