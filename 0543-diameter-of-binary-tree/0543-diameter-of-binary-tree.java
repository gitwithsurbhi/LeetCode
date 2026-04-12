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
    static class Info{
        int d;
        int h;
        public Info(int d,int h){
            this.d=d;
            this.h=h;
        }
    }
    private Info diam(TreeNode root){
        if(root==null)return new Info(0,0);
        Info leftDiam=diam( root.left);
        Info rightDiam=diam( root.right);
        int diameter=Math.max(Math.max(leftDiam.d,rightDiam.d),leftDiam.h+rightDiam.h+1);
        int ht=Math.max(leftDiam.h,rightDiam.h)+1;
        return new Info(diameter,ht);
    }

    public int diameterOfBinaryTree(TreeNode root) {
       return diam(root).d-1;
    }
}