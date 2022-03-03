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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return list;
        helper(root);
        return list;
    }
    private void helper(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            List<Integer> subList = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode temp = q.poll();
                if(temp == null) continue;
                subList.add(temp.val);
                q.add(temp.left);
                q.add(temp.right);
            }
            if(!subList.isEmpty()){
                if(!flag) Collections.reverse(subList);
                list.add(subList);
            }
            flag = !flag;
        }
    }
}