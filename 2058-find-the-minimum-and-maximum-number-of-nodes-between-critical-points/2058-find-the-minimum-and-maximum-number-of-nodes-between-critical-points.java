/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer>criticalPnts=new ArrayList<>();
        int idx=1;
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null && curr.next!=null){
            int val=curr.val;
            if(val<prev.val && val<curr.next.val || val>prev.val && val>curr.next.val){
                criticalPnts.add(idx);
            }
            idx++;
            prev=curr;
            curr=curr.next;
        }
        if(criticalPnts.size()<2)return new int[]{-1,-1};

        int minDist=Integer.MAX_VALUE;
        for(int i=1;i<criticalPnts.size();i++){
            minDist=Math.min(minDist,criticalPnts.get(i)-criticalPnts.get(i-1));

        }
        int maxDist=criticalPnts.get(criticalPnts.size()-1)-criticalPnts.get(0);
        return new int[]{minDist,maxDist};
      
    }
}