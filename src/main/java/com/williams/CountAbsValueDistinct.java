package com.williams;

import java.util.Arrays;

class CountAbsValueDistinct {
    public int solution(int[] A) {
        return (int) Arrays.stream(A).map(a -> a < 0 ? -a : a).distinct().count();
    }
}

