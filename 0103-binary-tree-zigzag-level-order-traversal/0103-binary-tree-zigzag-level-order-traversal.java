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
   
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>>res=new ArrayList<>();
       if(root==null){
              return res;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            LinkedList<Integer>ans=new LinkedList<>();
            int size=q.size();
        
           for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
            if(leftToRight){
                ans.addLast(curr.val);
            }else{
                ans.addFirst(curr.val);
            }
           
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
           }
           leftToRight=!leftToRight;
            res.add(ans);
        }
       return res;
    }
}