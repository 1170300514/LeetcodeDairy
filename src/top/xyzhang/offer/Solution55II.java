package top.xyzhang.offer;

import top.xyzhang.helper.TreeNode;

public class Solution55II {
    public boolean isBalanced(TreeNode root) {
        if (root != null) {
            if (Math.abs(maxdepth(root.left) - maxdepth(root.right)) <= 1) {
                return isBalanced(root.left) && isBalanced(root.right);
            }
            else return false;
        }
        return true;
    }

    int maxdepth(TreeNode node) {
        if (node != null) {
            return Math.max(maxdepth(node.left), maxdepth(node.right)) + 1;
        }
        return 0;
    }
}
