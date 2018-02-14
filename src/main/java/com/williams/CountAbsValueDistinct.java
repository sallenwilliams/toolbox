package com.williams;

import java.util.Arrays;

class CountAbsValueDistinct {
    public static int calculateNumberOfAbsoluteValues(int[] ints) {
        return (int) Arrays.stream(ints)
                .map(i -> i < 0 ? -i : i)
                .distinct()
                .count();
    }
}

