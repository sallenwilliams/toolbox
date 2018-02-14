package com.williams;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAbsValueDistinctTest {

    @Test
    public void testCountAbsoluteValueDistinct_correct_1() {
        assertEquals(4,CountAbsValueDistinct.calculateNumberOfAbsoluteValues(new int[]{3, 4, 4, 5, 6}));
    }

    @Test
    public void testCountAbsoluteValueDistinct_correct_2() {
        assertEquals(4,CountAbsValueDistinct.calculateNumberOfAbsoluteValues(new int[]{0, 4, -4, 5, 6, -5}));
    }
}

