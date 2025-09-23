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

    public void nthlevel1(TreeNode root, int n, List<Integer> temp) {

        if (root == null)
            return;

        if (n == 1) {
            temp.add(root.val);
        }

        nthlevel1(root.left, n - 1, temp);
        nthlevel1(root.right, n - 1, temp);

    }

    public void nthlevel2(TreeNode root, int n, List<Integer> temp) {

        if (root == null)
            return;

        if (n == 1) {
            temp.add(root.val);
        }

        nthlevel2(root.right, n - 1, temp);
        nthlevel2(root.left, n - 1, temp);

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        if (root == null)
            return list;

        int levels = height(root) + 1;

        for (int i = 1; i <= levels; i++) {

            List<Integer> temp = new ArrayList<>();

            if (i % 2 != 0)
                nthlevel1(root, i, temp);

            else
                nthlevel2(root, i, temp);

            list.add(temp);

        }

        return list;

    }
}