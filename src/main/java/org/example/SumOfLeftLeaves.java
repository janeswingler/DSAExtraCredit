package org.example;

// 404. Sum of Left Leaves
// LEETCODE DESCRIPTION:
// Given the root of a binary tree, return the sum of all left leaves.
//A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

public class SumOfLeftLeaves {

    private static class Node {
        int data;
        Node left;
        Node right;

        Node(int newData) {
            data = newData;
        }
    }

    public int sumOfLeftLeaves(Node subtree, boolean isLeft) {

        // Base case - tree is empty
        if (subtree == null) {
            return 0;
        }

        // Base case - we found a leaf
        if (subtree.left == null && subtree.right == null) {
            if (isLeft) {
                return subtree.data;
            } else {
                return 0;
            }
        }

        // Recursive case
        return sumOfLeftLeaves(subtree.left, true) + sumOfLeftLeaves(subtree.right, false);
    }

    public static void main(String[] args) {

        SumOfLeftLeaves test = new SumOfLeftLeaves();

        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        int sum = test.sumOfLeftLeaves(root, false);

        System.out.println("Sum of Left leaves: " + sum);
    }

}