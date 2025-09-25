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

    public void helper(List<List<Integer>> ans, List<Integer> temp, TreeNode root, int sum) {

        if (root == null)
            return;

        if (root.left == null && root.right == null) {

            temp.add(root.val);

            if (root.val == sum) {
                List<Integer> a = new ArrayList<>();
                for (int i = 0; i < temp.size(); i++) {
                    a.add(temp.get(i));
                }
                ans.add(a);
            }
            temp.remove(temp.size() - 1); // backtracking
            return;
        }

        temp.add(root.val);

        helper(ans, temp, root.left, sum - root.val);
        helper(ans, temp, root.right, sum - root.val);

        temp.remove(temp.size() - 1); // backtracking

    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(ans, temp, root, targetSum);

        return ans;
    }
}