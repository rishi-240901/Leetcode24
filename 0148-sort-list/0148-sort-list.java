class Solution {
    public ListNode sortList(ListNode head) {
        ListNode slow=head;
        if(head == null || head.next == null)
            return head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);

    }

    private  ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
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