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
    private TreeNode printTree(TreeNode node){
    if(node==null)return null;
    TreeNode root=new TreeNode(node.val);
    if(node.left!=null){
       root.left=printTree(node.left);
    }
    if(node.right!=null){
       root.right= printTree(node.right);
    }
    return root;
    }
    public TreeNode searchBST(TreeNode root, int val) {
      if(root==null)return null;
      if(root.val==val) {
        return printTree(root);
        } 
        if(root.val<val){
        return searchBST(root.right,val);
    }
    else{
      return  searchBST(root.left,val);
    }
   
    }
    
}