
class Solution {

    public static void invert(TreeNode root) {

        if (root == null)
            return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

    }

    public static boolean IsSame(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.val != root2.val)
            return false;

        return IsSame(root1.left, root2.left) && IsSame(root1.right, root2.right);

    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;

        invert(root.left);

        return IsSame(root.left, root.right);
        
    }
}