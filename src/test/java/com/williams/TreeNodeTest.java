package com.williams;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author swilliams
 */
public class TreeNodeTest {

    private TreeNode root;
    private int answer;

    @Before
    public void setUp() {
/*
 *        1
 *    2       3
 *  4  5   6
 */
        root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.addChild(left);
        root.addChild(right);
        left.addChild(new TreeNode(4));
        left.addChild(new TreeNode(5));
        right.addChild(new TreeNode(6));
        answer = 21;
    }

    @Test
    public void testSum() {
        int sum = TreeNode.sumTree(root);
        assertEquals(answer, sum);
    }
}