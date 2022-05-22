package mutation.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }

    @Test
    public void testIsPositive() {
        int a = 2;
        assertTrue(calculator.isPositive(a));
        /*int b = -5;
        assertFalse(calculator.isPositive(b));
        int c = 0;
        assertFalse(calculator.isPositive(c));*/
    }

    @Test
    public void testIsNegative() {
        int a = -2;
        assertTrue(calculator.isNegative(a));
        /*int b = 7;
        assertFalse(calculator.isNegative(b));
        int c = 0;
        assertFalse(calculator.isNegative(c));*/
    }

    @Test
    public void testSubtraction() {
        int a = 3;
        assertEquals(a, calculator.subtract(5, 2));
    }

    @Test
    public void testAddition() {
        int a = 6;
        assertEquals(a, calculator.add(2, 4));
    }

    @Test
    public void testDivision() {
        double a = 10.0;
        double b = 2.0;
        assertEquals(5.0, calculator.divide(a, b), 0.0001);
        //assertThrows(ArithmeticException.class, () -> calculator.divide(a, 0.0));
    }

    @Test
    public void testMultiplication() {
        int a = 2;
        int b = 4;
        assertEquals(8, calculator.multiply(a, b));
    }
}
