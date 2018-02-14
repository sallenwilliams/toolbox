package com.williams;

import java.util.ArrayList;

public class TreeNode {


    private static boolean debug = true;
    private int value;
    private ArrayList<TreeNode> children;

    protected static int sumTree(TreeNode node) {
        int returnInt = node.getValue();
        System.out.println("Root value...............[" + returnInt + "]");
        for (TreeNode treeNode : node.getChildren()) {
            if (debug) {
                boolean hasChildren;
                System.out.println("TreeNode child value.....[" + treeNode.getValue() + "]");
                if (treeNode.getChildren().size() > 0) {
                    hasChildren = true;
                } else {
                    hasChildren = false;
                }
                System.out.println("TreeNode have chitlens...[" + hasChildren + "]\n");
            }
            returnInt = returnInt + sumTree(treeNode);
        }
        return returnInt;
    }

    public TreeNode(int val) {
        value = val;
        children = new ArrayList<TreeNode>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int val) {   // To make immutable remove this set method since the value is passed into the constructor. - SAW 11-23-14
        value = val;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}
