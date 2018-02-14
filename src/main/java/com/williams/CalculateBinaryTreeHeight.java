package com.williams;

/*
 *
 *  @author swilliams
 *  @Date: 2/14/18 01:04
 *
 */
public class CalculateBinaryTreeHeight {
    static class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }

    public int solution(Tree T) {
        if (T == null) {
            return -1;
        }

        int leftTurns = 0;
        int rightTurns = 0;
        int longestPath = 0;
        boolean previousHasLeft = false;
        boolean previousHasRight = false;

        previousHasLeft = T.l != null;
        previousHasRight = T.r != null;

        if (T.l != null && previousHasRight && !previousHasLeft) {
            leftTurns++;
        }

        if (T.r != null && previousHasLeft && !previousHasRight) {
            rightTurns++;
        }
        // Recursively walk the given Tree down to the leaf node determining it's Path,
        // adding 1 to compensate for the offset
        longestPath = 1 + Math.max(solution(T.l), solution(T.r));
        return rightTurns > leftTurns ? rightTurns : leftTurns;
    }
}
