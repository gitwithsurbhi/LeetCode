 class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
    //   ListNode prev=null;
    //   ListNode curr=head;
    //  ListNode next;
    //  while(curr!=null){
    //     next=curr.next;
    //     curr.next=prev;
    //     prev=curr;
    //     curr=next;
    //  }
    //  head=prev;
      return newNode;
    }
}