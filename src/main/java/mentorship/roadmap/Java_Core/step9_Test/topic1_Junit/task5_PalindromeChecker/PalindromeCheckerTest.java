package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
    @Test
    void basicPalindrome() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    void notPalindrome() {
        Assertions.assertFalse(PalindromeChecker.isPalindrome("qwerty"));
    }

    @Test
    void registerTest() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("Madam"));
    }

    @Test
    void textWithSpaces() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("Я ем змея"));
    }

    @Test
    void textWithPunktuation() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("Я ем, змея!"));
    }

    @Test
    void textIsEmpty() {
        Assertions.assertFalse(PalindromeChecker.isPalindrome(""));
    }

    @Test
    void longPalindrome() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("A man, a plan, a canal, Panama"));
    }
}
