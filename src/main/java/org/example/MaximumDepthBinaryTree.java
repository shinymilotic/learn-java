package org.example;

import org.example.data_structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class MaximumDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int high = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }

            high++;
        }

        return high;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.setLeft(new TreeNode(15));
        right.setRight(new TreeNode(7));
        root.setLeft(left);
        root.setRight(right);
    }
}
