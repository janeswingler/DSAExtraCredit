package org.example;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {

    public void find_binary_paths(TreeNode root, String path, LinkedList<String> paths) {
        if (root != null) {

            path += Integer.toString(root.data);

            // A leaf has been reached
            if ((root.left == null) && (root.right == null))
                paths.add(path);

            // Go deeper
            else {
                path += "->";
                find_binary_paths(root.left, path, paths);
                find_binary_paths(root.right, path, paths);
            }
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList();
        find_binary_paths(root, "", paths);
        return paths;
    }
}
