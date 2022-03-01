/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int max = 0;
        if(root.children != null){
            for(Node child : root.children){
                max = Math.max(max, maxDepth(child));
            }
        }
        return max + 1;
    }
}
//     public int helper(Node root){
        
//         len++;
//         if(root != null && root.children == null) return len;
//         // max = Math.max(max, len);
//         // int max = 1;
//         if(root != null && root.children != null){
//             for(Node child : root.children){
//                max = Math.max(max, helper(child));
//             }
//         }
//         return max;
        
        /*
            len++;
        if(root != null && root.left == null && root.right == null) return len;
        
        int left = 1;
        int right = 1;
        if(root != null && root.left != null) left = helper(root.left, len);
        if(root != null && root.right != null) right = helper(root.right, len);
        max = Math.max(left, right);
        return max;
        */
        
    // }
// }