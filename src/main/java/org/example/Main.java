package org.example;
import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Test tilt
        BinaryTreeTilt btt = new BinaryTreeTilt();
        System.out.println("Total tilt: " + btt.findTilt(root));

        // Test Binary Tree paths
        BinaryTreePaths btp = new BinaryTreePaths();
        List<String> paths = btp.binaryTreePaths(root);
        // Print each path
        for(String path : paths) {
            System.out.println(path);
        }

        // Test LeafSimilarTrees

        // Tree1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        // Tree1
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);


        LeafSimilarTrees similarTrees = new LeafSimilarTrees();
        boolean areSimilar = similarTrees.isSimilar(root1, root2);
        System.out.println("Are the two trees leaf similar? " + areSimilar);
    }
}
