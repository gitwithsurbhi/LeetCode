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
    private int sum=0;
   
    private void path(TreeNode root,int curr){
        if(root==null){
        return;
        }
        curr=curr*2+root.val;
        if(root.left==null && root.right==null){
            sum+=curr;
        }
        
        path(root.left,curr);
        path(root.right,curr);
    }
    public int sumRootToLeaf(TreeNode root) {
        sum=0;
        path(root,0);
        return sum;
    }
}