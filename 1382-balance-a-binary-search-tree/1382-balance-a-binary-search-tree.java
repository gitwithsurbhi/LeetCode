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
    private void inorder(TreeNode root,ArrayList<Integer>res){
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
     }
     private TreeNode createBST(ArrayList<Integer>list,int s,int e){
     if(s>e)return null;
     int mid=s+(e-s)/2;
     TreeNode root=new TreeNode(list.get(mid));
     root.left=createBST(list,s,mid-1);
     root.right=createBST(list,mid+1,e);
     return root;
     }
    public TreeNode balanceBST(TreeNode root) {
       ArrayList<Integer>list=new ArrayList<>();
       inorder(root,list);
    return createBST(list,0,list.size()-1);
    }
}