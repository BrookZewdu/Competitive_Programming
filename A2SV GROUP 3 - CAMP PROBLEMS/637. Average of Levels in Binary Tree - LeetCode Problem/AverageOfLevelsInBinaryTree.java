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
    List<Double> list = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null) return list;
        helper(root);
        return list;
    }
    private void helper(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            double ave = 0;
            for(int i = 0; i < n; i++){
                TreeNode temp = q.poll();
                ave += temp.val;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            list.add(ave / (double)n);
            
        }
    }
}