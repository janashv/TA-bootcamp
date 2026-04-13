package module10.activity.activity3;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    @Override
    protected void setUp() {
        calculator = new Calculator();
    }

    @Override
    protected void tearDown() {
        calculator = null;
    }

    public void testAddTwoPositiveNumbers() {
        assertEquals(11, calculator.add(6, 5));
    }

    public void testAddTwoNegativeNumbers() {
        assertEquals(-3, calculator.add(-1, -2));
    }

    public void testAddThreePositiveNumbers() {
        assertEquals(21, calculator.add(10, 5, 6));
    }

    public void testAddThreeMixedNumbers() {
        assertEquals(5, calculator.add(10, -3, -2));
    }

    public void testSubtractPositiveNumbers() {
        assertEquals(2, calculator.subtract(22, 20));
    }

    public void testSubtractNegativeResult() {
        assertEquals(-5, calculator.subtract(7, 12));
    }

    public void testDivideValidNumbers() {
        assertEquals(6, calculator.divide(12, 2));
    }

    public void testDivideByZero() {
        assertEquals(0, calculator.divide(10, 0));
    }

    public void testMultiplyValidNumbers() {
        assertEquals(36, calculator.multiply(6, 6));
    }

    public void testMultiplyWithNegativeNumber() {
        assertEquals(0, calculator.multiply(-4, 5));
    }

    public void testAddWithZero() {
        assertEquals(5, calculator.add(5, 0));
        assertEquals(0, calculator.add(0, 0));
    }

    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5));
    }


}
