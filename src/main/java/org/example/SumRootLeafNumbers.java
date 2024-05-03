package org.example;

import org.example.data_structure.TreeNode;

public class SumRootLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return sumTree(root, 0);
    }

    public int sumTree(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        sum = sum*10 + root.getVal();

        if (root.getLeft() == null && root.getRight() == null) {
            return sum;
        }

        return sumTree(root.getLeft(), sum) + sumTree(root.getRight(), sum);
    }

}
