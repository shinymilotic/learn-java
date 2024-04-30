package org.example;

import org.example.data_structure.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        
        
        return null;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.setLeft(new TreeNode(2));
        node.setRight(new TreeNode(5));
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        node2.setLeft(new TreeNode(5));
        TreeNode node3 = new TreeNode(6);
        node3.setRight(new TreeNode(9));
        InvertBinaryTree algo = new InvertBinaryTree();
        algo.invertTree(null);
    }
}
