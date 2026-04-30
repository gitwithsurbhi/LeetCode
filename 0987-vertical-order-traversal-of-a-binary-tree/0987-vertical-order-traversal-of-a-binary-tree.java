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
    class Tuple {
        TreeNode node;
        int row;
        int col;
        public Tuple(TreeNode node,int row,int col){
            this.node=node;
            this.row=row;
            this.col=col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<Tuple>q=new LinkedList<>();
        q.add(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple tup=q.remove();
            TreeNode node=tup.node;
            int vd=tup.row;
            int ld=tup.col;
            if(!map.containsKey(vd)){
                map.put(vd,new TreeMap<>());
            }
            if(!map.get(vd).containsKey(ld)){
                map.get(vd).put(ld,new PriorityQueue<>());
            }
            map.get(vd).get(ld).offer(node.val);
            if(node.left!=null){
                q.add(new Tuple(node.left,vd-1,ld+1));
            }
            if(node.right!=null){
               q.add(new Tuple(node.right,vd+1,ld+1));
            }
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>>ys:map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer>nodes:ys.values()){
                while(!nodes.isEmpty()){
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
    return ans;
    }
}