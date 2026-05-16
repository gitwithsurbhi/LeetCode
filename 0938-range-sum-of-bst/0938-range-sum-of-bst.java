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
    private void helper(TreeNode root, int low, int high){
        if(root==null)return;
        //case 1
        if(root.val >=low && root.val <=high){
            helper(root.left,low,high);
            sum+=root.val;
            helper(root.right,low,high);
        }
        //case-2
       else if(root.val > high){
          helper(root.left,low,high);
        }
      else if(root.val <low){
        helper(root.right,low,high);
      }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
       helper(root,low,high);
       return sum;
        
    }
}