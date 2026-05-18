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
    TreeNode prev=null;
    private int minDiff=Integer.MAX_VALUE;
     public int getMinimumDifference(TreeNode root) {
       if(root==null)return Integer.MAX_VALUE;
       if(root.left!=null){
        int leftMin=getMinimumDifference(root.left);
        minDiff=Math.min(leftMin,minDiff);
       }
       if(prev!=null){
        minDiff=Math.min(minDiff,root.val-prev.val);
       }
       prev=root;
        if(root.right!=null){
        int rightMin=getMinimumDifference(root.right);
        minDiff=Math.min(rightMin,minDiff);
       }
    return minDiff;    
    }
}