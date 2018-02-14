package com.williams;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 *
 *  @author swilliams
 *  @Date: 2/14/18 01:06
 *
 */
public class CalculateBinaryTreeHeightTest {

    CalculateBinaryTreeHeight.Tree tree__1 = new CalculateBinaryTreeHeight.Tree();
    CalculateBinaryTreeHeight.Tree tree__2 = new CalculateBinaryTreeHeight.Tree();
    CalculateBinaryTreeHeight.Tree tree5_1 = new CalculateBinaryTreeHeight.Tree();
    CalculateBinaryTreeHeight.Tree tree4_1 = new CalculateBinaryTreeHeight.Tree();
    CalculateBinaryTreeHeight.Tree tree3_1 = new CalculateBinaryTreeHeight.Tree();
    CalculateBinaryTreeHeight.Tree tree3_2 = new CalculateBinaryTreeHeight.Tree();
    CalculateBinaryTreeHeight.Tree tree3_3 = new CalculateBinaryTreeHeight.Tree();
    CalculateBinaryTreeHeight.Tree tree2_1 = new CalculateBinaryTreeHeight.Tree();
    CalculateBinaryTreeHeight.Tree tree2_2 = new CalculateBinaryTreeHeight.Tree();

    @Test
    public void testCalculateHeight() {
        // Grow First Tree w/height of 2
        {
            tree3_1.x = 20;
            tree3_1.l = null;
            tree3_1.r = null;

            tree3_2.x = 21;
            tree3_2.l = null;
            tree3_2.r = null;

            tree3_3.x = 1;
            tree3_3.l = null;
            tree3_3.r = null;

            tree2_1.x = 3;
            tree2_1.l = tree3_1;
            tree2_1.r = tree3_2;

            tree2_2.x = 10;
            tree2_2.l = tree3_2;
            tree2_2.r = null;

            tree__1.x = 5;
            tree__1.l = tree2_1;
            tree__1.r = tree2_2;
        }
        assertEquals(0, new CalculateBinaryTreeHeight().solution(tree__1));

        // Grow Second Tree w/height of 4
        {
            tree5_1.x = 15;
            tree5_1.l = null;
            tree5_1.r = null;

            tree4_1.x = 14;
            tree4_1.l = tree5_1;
            tree4_1.r = null;

            tree3_1.x = 20;
            tree3_1.l = tree4_1;
            tree3_1.r = null;

            tree3_2.x = 21;
            tree3_2.l = null;
            tree3_2.r = null;

            tree3_3.x = 1;
            tree3_3.l = tree4_1;
            tree3_3.r = null;

            tree2_1.x = 3;
            tree2_1.l = tree3_1;
            tree2_1.r = tree3_2;

            tree2_2.x = 10;
            tree2_2.l = tree3_2;
            tree2_2.r = null;

            tree__2.x = 7;
            tree__2.l = tree2_1;
            tree__2.r = tree2_2;
        }
        assertEquals(0, new CalculateBinaryTreeHeight().solution(tree__2));
    }

}