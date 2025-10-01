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

    public void traverse(TreeNode root, List<Integer> temp, int n) {

        if (root == null)
            return;

        if (n == 1)
            temp.add(root.val);
            
        traverse(root.left, temp, n - 1);
        traverse(root.right, temp, n - 1);

    }

    public int height(TreeNode root) {

        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        int levels = height(root) + 1;

        for (int i = levels; i >= 0; i--) {

            List<Integer> temp = new ArrayList<>();
            traverse(root, temp, i);

            if (!temp.isEmpty())
                ans.add(temp);

        }

        return ans;

    }
}