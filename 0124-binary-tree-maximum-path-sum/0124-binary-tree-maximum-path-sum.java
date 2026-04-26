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
    
    private int helper(TreeNode root,int[] max){
        if(root==null)return 0;

        int leftSum=helper(root.left,max);
        int rightSum=helper(root.right,max);

        max[0]=Math.max(max[0],leftSum+rightSum+root.val);
        return root.val+Math.max(leftSum,rightSum);
    }
    public int maxPathSum(TreeNode root) {
        int []max=new int[1];
        max[0]=Integer.MIN_VALUE;
      int ans=  helper(root,max);
        return max[0];

    }
}