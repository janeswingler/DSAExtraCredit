package org.example;
//FROM LEETCODE:
//Given the root of a binary tree, return the sum of every tree node's tilt.
// The tilt of a tree node is the absolute difference between the sum of all left subtree node values and all right subtree node values.
// If a node does not have a left child, then the sum of the left subtree node values is treated as 0.
// The rule is similar if the node does not have a right child.


// I recursed over all the left and right subtrees finding tilt at each level and propagated up the tree to find the total tilt

public class BinaryTreeTilt {
    private int treeTilt = 0;

    public int findTilt(TreeNode node) {
        sumOfSubtree(node);
        return treeTilt;
    }

    // Recurse over subtrees and find the tilt at each level
    private int sumOfSubtree(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = sumOfSubtree(node.left);
        int rightSum = sumOfSubtree(node.right);

        int tilt = Math.abs(leftSum - rightSum);
        treeTilt += tilt;

        return node.data + leftSum + rightSum;
    }
}
