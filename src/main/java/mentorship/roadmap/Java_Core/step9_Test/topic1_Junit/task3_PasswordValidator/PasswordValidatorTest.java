package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task3_PasswordValidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void passwordIsShort() {
        Assertions.assertFalse(PasswordValidator.isValid("123456"));
    }

    @Test
    void containsNoNumber() {
        Assertions.assertFalse(PasswordValidator.isValid("qwertyuiop"));
    }

    @Test
    void correctPassword() {
        Assertions.assertTrue(PasswordValidator.isValid("qwerty123"));
    }

    @Test
    void passwordIsEmpty() {
        Assertions.assertFalse(PasswordValidator.isValid(""));
    }
}
