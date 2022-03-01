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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return helper(root, targetSum, 0);
    }
    public boolean helper(TreeNode root, int targetSum, int currSum){
        if(root != null) currSum += root.val;
        if(root != null && root.left == null && root.right == null){
            return (targetSum == currSum) ? true : false;
        }
        boolean left = false;
        boolean right = false;
        if(root != null && root.left != null) left = helper(root.left, targetSum, currSum);
        if(root != null && root.right != null) right = helper(root.right, targetSum, currSum);
        return left || right; 
    }
}
// if(root != null) currSum += root.val;
        // if(root != null && root.left == null && root.right == null){
        //     if(currSum == targetSum){
        //         return true;
        //     }else{
        //         return false;
        //     }
        // } 
        // boolean left = false;
        // boolean right = false;
        // if(root != null && root.left != null) {
        //     left = helper(root.left, targetSum, currSum);
        // }
        // if(root != null && root.right != null){
        //     right = helper(root.right, targetSum, currSum);
        // }
        // return left || right;