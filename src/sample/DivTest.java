package sample;
import static org.junit.Assert.*;
import org.junit.Test;
public class DivTest {
    @Test
    public void testDivIntPass() {
        assertEquals("error in divInt()", 3, Calculation.divInt(9, 3));
        assertEquals("error in divInt()", 0, Calculation.divInt(1, 9));
    }

    @Test
    public void testDivIntFail() {
        assertNotSame("error in divInt()", 1, Calculation.divInt(9, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivIntByZero() {
        Calculation.divInt(9, 0); // expect an IllegalArgumentException
    }

    @Test
    public void testDivRealPass() {
        assertEquals("error in divInt()", 0.333333, Calculation.divReal(1, 3), 1e-6);
        assertEquals("error in divInt()", 0.111111, Calculation.divReal(1, 9), 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivRealByZero() {
        Calculation.divReal(9, 0); // expect an IllegalArgumentException
    }
}
