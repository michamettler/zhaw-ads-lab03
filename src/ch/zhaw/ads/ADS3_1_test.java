package ch.zhaw.ads;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ADS3_1_test {
    Competitor c1, c2, c3, c4;

    @BeforeEach
    public void setUp() {
        c1 = new Competitor(0, "Mueller Stefan", "02:31:14");
        c2 = new Competitor(0, "Marti Adrian", "02:30:09");
        c3 = new Competitor(0, "Kiptum Daniel", "02:11:31");
        c4 = new Competitor(0, "Speedy Gonzales", "1:11:31");
    }

    @Test
    public void testEquals() {
        assertTrue(c3.equals(c3), c3.getTime() + " == "+c3.getTime());
        assertTrue(!c3.equals(c2), c3.getTime() + " != "+c2.getTime());
        assertTrue(!c3.equals(null), "equals(null)");
        assertTrue(!c3.equals(new Object()), "equals(new Object())");
    }

    @Test
    public void testCompare() {
        assertTrue(c1.compareTo(c2) > 0, c1.getName() +" "+c1.getTime() + " > "+c2.getTime());
        assertTrue(c2.compareTo(c1) < 0, c2.getName() +" "+c2.getTime() + " < "+c1.getTime());
        assertTrue(c3.compareTo(c3) == 0, c3.getName() +" "+c3.getTime() + " == "+c3.getTime());
        assertTrue(c4.compareTo(c2) < 0, c4.getName() +" "+c4.getTime() + " < "+c2.getTime());
    }
}
