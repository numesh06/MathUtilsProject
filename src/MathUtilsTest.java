import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(4, 2), 0.001);
        assertEquals(-1.0, mathUtils.divide(5, 0), 0.001);
    }
}
