package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task7_LeapYearChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCheckerTest {
    @Test
    void multipleOf4() {
        Assertions.assertFalse(LeapYearChecker.isLeapYear(1996));
    }

    @Test
    void multipleOf100() {
        Assertions.assertFalse(LeapYearChecker.isLeapYear(1900));
    }

    @Test
    void multipleOf400() {
        Assertions.assertTrue(LeapYearChecker.isLeapYear(2000));
    }

    @Test
    void nonLeapYear() {
        Assertions.assertFalse(LeapYearChecker.isLeapYear(1993));
    }
}
