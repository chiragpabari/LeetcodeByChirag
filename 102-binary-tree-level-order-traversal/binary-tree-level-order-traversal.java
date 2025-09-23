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

        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));

    }

    public void nthlevel(TreeNode root, int n, List<Integer> temp) {

        if (root == null)
            return;

        if (n == 1) {
            temp.add(root.val);
        }

        nthlevel(root.left, n - 1, temp);
        nthlevel(root.right, n - 1, temp);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        if (root == null)
            return list;

        int levels = height(root) + 1;

        for (int i = 1; i <= levels; i++) {

            List<Integer> temp = new ArrayList<Integer>();

            nthlevel(root, i, temp);

            list.add(temp);

        }

        return list;

    }
}