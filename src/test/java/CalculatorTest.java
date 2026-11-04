import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(56, calculator.add(28, 28));
    }

    @Test
    void testAdditionNegative() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(-2, 2));
    }
}