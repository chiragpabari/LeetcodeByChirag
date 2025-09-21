/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        int hl = 0;
        int hr = 0;
        if (root == null)
            return true;
        if (root.left != null)
            hl = height(root.left) + 1;
        if (root.right != null)
            hr = height(root.right) + 1;
        int diff = Math.abs(hl - hr);
        return diff <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
}