import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class TempsTest {
    /**
     * Method under test: {@link Temps#fToC(double)}
     */
    @Test
    public void testFToC() {
        assertEquals(-12.222222222222221d, Temps.fToC(10.0d), 0.0);
    }

    /**
     * Method under test: {@link Temps#cToF(double)}
     */
    @Test
    public void testCToF() {
        assertEquals(50.0d, Temps.cToF(10.0d), 0.0);
    }

    /**
     * Method under test: {@link Temps#cToK(double)}
     */
    @Test
    public void testCToK() {
        assertEquals(283.15d, Temps.cToK(10.0d), 0.0);
    }

    /**
     * Method under test: {@link Temps#kToC(double)}
     */
    @Test
    public void testKToC() {
        assertEquals(-263.15d, Temps.kToC(10.0d), 0.0);
        assertThrows(IllegalArgumentException.class, () -> Temps.kToC(-0.5d));
    }

    /**
     * Method under test: {@link Temps#kToF(double)}
     */
    @Test
    public void testKToF() {
        assertEquals(-441.67d, Temps.kToF(10.0d), 0.0);
        assertThrows(IllegalArgumentException.class, () -> Temps.kToF(-0.5d));
    }

    /**
     * Method under test: {@link Temps#fToK(double)}
     */
    @Test
    public void testFToK() {
        assertEquals(260.92777777777775d, Temps.fToK(10.0d), 0.0);
    }
}

