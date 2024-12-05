import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void TwoPlusTwoShouldEqualFour() {

        assertEquals(4, calc.add(2, 2));
    }

    @Test
    void TwoPlusTwoShouldNotEqualFiv() {

        assertNotEquals(4, calc.add(2, 3));
    }

    @Test
    void FourTimesFiveShouldEqualTwenty() {
        assertEquals(20, calc.multiply(4, 5));

    }

}