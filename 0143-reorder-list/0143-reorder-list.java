class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
         ListNode k = slow.next;
        while(fast!=null && fast.next!=null){
           
            slow=slow.next;
            fast=fast.next.next;
        }
        k=slow.next;
        slow.next=null;

        ListNode curr=k;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            ListNode n1=first.next;
            ListNode n2=second.next;
            first.next=second;
            second.next=n1;
            first=n1;
            second=n2;
        }
    }
}