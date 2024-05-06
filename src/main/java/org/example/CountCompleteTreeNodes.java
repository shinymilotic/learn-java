package org.example;

import org.example.data_structure.TreeNode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        return sumNodes(root, 0);
    }

    private int sumNodes(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return 0;
    }
}
