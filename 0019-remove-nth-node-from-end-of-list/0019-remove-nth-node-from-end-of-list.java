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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
      int size=0;
      ListNode temp=head;
      while(temp!=null){
        temp=temp.next;
        size++;
      } 
      if(size==n){         //removeFirst
        head=head.next;
        return head;
      } 

      int i=1;
      int ithn=size-n;
      ListNode prev=head;
      while(i<ithn){
       prev=prev.next;
       i++;
      }
      prev.next=prev.next.next;
      return head;
    }
}