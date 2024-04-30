package org.example;

import org.example.data_structure.TreeNode;

public class SameTree {


    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        boolean isNodeSame = p.getVal() == q.getVal();
        boolean isLeftSame = isSameTree(p.getLeft(), q.getLeft());
        boolean isRightSame = isSameTree(p.getRight(), q.getRight());

        if (isNodeSame == true && isLeftSame == true && isRightSame == true) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        
    }
}
