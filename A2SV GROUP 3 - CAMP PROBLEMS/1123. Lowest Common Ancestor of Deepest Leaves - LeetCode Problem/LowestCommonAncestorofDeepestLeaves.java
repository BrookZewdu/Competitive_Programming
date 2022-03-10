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
    TreeNode ans;
    private int max = 0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        helper(root, 0);
        return ans;
    }
    private int helper(TreeNode root, int depth){
        max = Math.max(max, depth);
        if(root == null) return depth;
        int left = helper(root.left, depth + 1);
        int right = helper(root.right, depth + 1);
        
        if(left == right && left == max) {
            this.ans = root;
        }
        
        return Math.max(left, right);
    }
}