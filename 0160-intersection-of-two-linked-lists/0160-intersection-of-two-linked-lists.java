/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int getLength(ListNode head){
      ListNode temp=head;
      int length=0;
      while(temp!=null){
        length++;
        temp=temp.next;
      }
      return length;
    }
    private ListNode moveHeadByK(ListNode head,int k){
      ListNode temp=head;
      while(k>0){
        temp=temp.next;
        k--;
      }
      return temp;
    }
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {

        //Length of Both Linked List
     int l1=getLength(head1);
     int l2=getLength(head2);

     ListNode ptr1,ptr2;
     //diff of length
    if(l1>l2){
       int k=l1-l2;
       ptr1=moveHeadByK(head1,k);
       ptr2=head2; 
     }
     else{
        int k=l2-l1;
       ptr2=moveHeadByK(head2,k);
       ptr1=head1; 
     }

     //compare 
     while(ptr1!=null){
        if(ptr1==ptr2){
            return ptr1;
        }
        ptr1=ptr1.next;
        ptr2=ptr2.next;
     }

     return null;
    }
}