
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;

        ListNode left = insertionSortList(head);
        ListNode right = insertionSortList(mid);

        return insert(left,right);
    }

    private ListNode insert(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode (-1);
        ListNode k=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                k.next=l1;
                l1=l1.next;
            }
            else{
                k.next=l2;
                l2=l2.next;
            }
            k=k.next;
        }
       if(l1!=null){
            k.next=l1;
        }
       if(l2!=null){
            k.next=l2;
        }
        return dummy.next;
    }
}