package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task1_DivisionCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivisionCalculatorTest {
    private DivisionCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new DivisionCalculator();
    }

    @Test
    void divideReturnsSameNumber() {
        double div = calculator.divide(10,1);
        Assertions.assertEquals(10.0,div);
    }

    @Test
    void divideReturnsNegativeNumber () {
        double div = calculator.divide(10,-1);
        Assertions.assertEquals(-10.0,div);
    }

    @Test
    void divideByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10,0));
    }
}
