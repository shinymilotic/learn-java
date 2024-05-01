package org.example;

import com.sun.source.tree.Tree;
import org.example.data_structure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.getLeft(), root.getRight());
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {

        if (left == null && right == null ) {
            return true;
        } else if(left == null || right == null) {
            return false;
        }

        if (left.getVal() == right.getVal() &&
                isSymmetric(left.getLeft(), right.getRight()) &&
                isSymmetric(left.getRight(), right.getLeft())) {
            return true;
        }

        return false;
    }
}
