import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    public void testAdd() {
        assertEquals(8, MathUtil.add(5, 3));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(2, MathUtil.subtract(5, 3));
    }
}
