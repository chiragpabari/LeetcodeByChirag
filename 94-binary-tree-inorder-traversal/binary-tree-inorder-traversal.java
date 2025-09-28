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

    public void traverse(TreeNode root,List<Integer> nodes){

        if(root==null) return;
        traverse(root.left,nodes);
        nodes.add(root.val);
        traverse(root.right,nodes);
         
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> nodes=new ArrayList<>();
        if(root==null) return nodes;
        traverse(root,nodes);
        return nodes;

    }
}