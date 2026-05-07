/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        StringBuilder s=new StringBuilder();
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node==null){
                s.append("null ");
                continue;
            }
            s.append(node.val+" ");
            if(root!=null){
                q.add(node.left);
                q.add(node.right);
            }

        }
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")return null;
        Queue<TreeNode>q=new LinkedList<>();
        String []value=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(value[0]));
        q.add(root);
        for(int i=1;i<value.length;i++){
             TreeNode parent=q.poll();
            if(!value[i].equals("null")){
            TreeNode node=new TreeNode(Integer.parseInt(value[i]));
             parent.left=node;
             q.add(node);
             }
            if(!value[++i].equals("null")){
            TreeNode node=new TreeNode(Integer.parseInt(value[i]));
             parent.right=node;
             q.add(node);
             }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));