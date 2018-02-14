package com.williams;

import java.util.Arrays;

class CountAbsValueDistinct {
    public static int calculateNumberOfAbsoluteValues(int[] ints) {
        return (int) Arrays.stream(ints)
                .map(Math::abs)
                .distinct()
                .count();
    }
}

