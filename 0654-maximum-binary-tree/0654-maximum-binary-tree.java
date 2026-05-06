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
    private int maxIdx(int []nums,int l,int r){
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=l;i<=r;i++){
            if(nums[i]>max){
            max=nums[i];
            idx=i;
            }
        }
    return idx;
    } 
    private TreeNode binaryTree(int []nums,int s,int e){
        if(s>e)return null;
        int idx=maxIdx(nums,s,e);
        TreeNode root=new TreeNode(nums[idx]);
     root.left=binaryTree(nums,s,idx-1);
     root.right=binaryTree(nums,idx+1,e);
     return root;
    }
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return binaryTree(nums,0,nums.length-1);
        
    }
}