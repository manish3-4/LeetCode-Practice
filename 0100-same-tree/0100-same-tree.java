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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean value, value1;
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(q.val != p.val) return false;
         value = isSameTree(p.left, q.left);
         value1 = isSameTree(p.right, q.right);
        
        return (value && value1);
    }
}