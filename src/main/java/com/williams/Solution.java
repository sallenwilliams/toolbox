package com.williams;


import java.util.stream.Stream;

/*
 *
 *  @author swilliams
 *  @Date: 2/14/18 02:15
 *
 */
public class Solution {

    static int solution(int N) {
        return Stream
                .of(
                        Integer.toBinaryString(N)
                                // when using regex you automatically have two problems, lol.  remove trailing zeros
                                .replaceAll("0+$", "")
                                // token up the String on the 1's
                                .split("1+"))
                // remove the nulls from the split
                .filter(a -> a != null)
                // redo with the length of each element
                .map(String::length)
                // find the largest
                .max(Integer::compare)
                // return value if present, if not return 0
                .orElse(0);
    }
}
