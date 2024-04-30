package org.example.data_structure;


// Definition for a binary tree node.
public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;
    
    TreeNode() {}

    public TreeNode(int val) { this.val = val; }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void setLeft(TreeNode node) {
        this.left = node;
    }

    public void setRight(TreeNode node) {
        this.right = node;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
