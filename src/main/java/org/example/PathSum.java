package org.example;

import org.example.data_structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                TreeNode poppedValue = queue.poll();

                if (poppedValue.getLeft() == null &&
                        poppedValue.getRight() == null &&
                        poppedValue.getVal() == targetSum) {
                    return true;
                }

                if (poppedValue.getLeft() != null) {
                    int leftValue = poppedValue.getLeft().getVal();
                    poppedValue.getLeft().setVal(leftValue + poppedValue.getVal());
                    queue.add(poppedValue.getLeft());
                }

                if (poppedValue.getRight() != null) {
                    int rightValue = poppedValue.getRight().getVal();
                    poppedValue.getRight().setVal(rightValue + poppedValue.getVal());
                    queue.add(poppedValue.getRight());
                }

            }
        }


        return false;
    }
}
