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
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int currMax = Integer.MIN_VALUE;
            int size = queue.size();
            
            for(var i = 0; i < size; i++) {
                TreeNode temp = queue.remove();
                currMax = Math.max(currMax, temp.val);
                if (temp.left != null) queue.offer(temp.left);
                if (temp.right != null) queue.offer(temp.right);
                
            }
            // System.out.println(Integer.MIN_VALUE);
            result.add(currMax);
            
        }
        return result;
    }
}