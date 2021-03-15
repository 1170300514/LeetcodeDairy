package top.xyzhang.offer;

import top.xyzhang.helper.TreeNode;

/**
 * 二叉树深度
 */
public class Solution55 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode node) {
        if (node != null) {
            return Math.max(maxDepth(node.left),maxDepth(node.right)) + 1;
        }
        return 0;
    }
}
