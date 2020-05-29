package hyunyong.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator(3, 5);

        int result = calculator.add();

        assertEquals(result, 8);
    }

    @Test
    void minus() {
        Calculator calculator = new Calculator(3, 5);

        int result = calculator.minus();

        assertEquals(result, -2);
    }
}

