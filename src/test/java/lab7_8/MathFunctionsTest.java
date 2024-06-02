package lab7_8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathFunctionsTest {

    @Test
    public void testAdd() {
        assertEquals(5, MathFunctions.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, MathFunctions.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, MathFunctions.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, MathFunctions.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathFunctions.divide(1, 0);
        });
        assertEquals("Divider cannot be zero", exception.getMessage());
    }
}
