class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
    return head;
}
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;           
        }
        int i=0;
        k = k % count;
        if (k == 0) {
    return head;
}
        ListNode tail=head;
        while(i<count-k-1){
            tail=tail.next;
            i++; 
        }

        ListNode newHead=tail.next;
        tail.next=null;
        temp.next=head;
        head=newHead;
        return head;
    }
}