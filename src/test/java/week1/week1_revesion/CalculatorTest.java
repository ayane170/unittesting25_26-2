package week1.week1_revesion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void test_add() {
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    void test_subtract() {
        assertEquals(5, calc.subtract(7, 2));
    }

    @Test
    void test_multiply() {
        assertEquals(10, calc.multiply(5, 2));
    }

    @Test
    void test_divide() {
        assertEquals(1, calc.divide(2, 2));
    }
    @Test
    void test_divide_by_zero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }

}