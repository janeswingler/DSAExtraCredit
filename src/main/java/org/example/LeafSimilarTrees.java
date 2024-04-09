package org.example;

import java.util.ArrayList;
import java.util.List;

//Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
public class LeafSimilarTrees {

    public boolean isSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList();
        List<Integer> leaves2 = new ArrayList();
        search(root1, leaves1);
        search(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public void search(TreeNode node, List<Integer> leafValues) {
        if (node != null) {
            if (node.left == null && node.right == null)
                leafValues.add(node.data);
                search(node.left, leafValues);
                search(node.right, leafValues);
        }
    }

}
