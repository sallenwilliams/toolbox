package com.williams;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author swilliams
 */
public class SratchTest {

    @Test
    public void testAbsValueMath() {
        int ints[] = new int[]{3, 4, 5, 6, -3, -4, -5, -6};
        for (int i : ints) {
            if (i < 0) {
                assertEquals(Math.abs(i), -i);
            } else {
                assertEquals(Math.abs(i), i);
            }
        }
    }
}