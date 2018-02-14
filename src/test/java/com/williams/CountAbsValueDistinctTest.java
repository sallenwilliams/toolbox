package com.williams;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountAbsValueDistinctTest {

    @Test
    public void testCountAbsoluteValueDistinct() throws Exception {
        CountAbsValueDistinct sol = new CountAbsValueDistinct();
        assertEquals(4,sol.solution(new int[]{3, 4, 4, 5, 6}));
    }
}

