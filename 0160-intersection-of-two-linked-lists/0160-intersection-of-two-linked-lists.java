public class Solution {
    public int sizeLL(ListNode head){
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        int sizeA=sizeLL(headA);
        int sizeB=sizeLL(headB);
        int diff=sizeA-sizeB;
        ListNode ptr1=headA;
        ListNode ptr2=headB;
        if(diff>0){
            while(diff>0){
                ptr1=ptr1.next;
                diff--;
            }
        }
        else{
            while(diff<0){
                ptr2=ptr2.next;
                diff++;
            }
        }
        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr1;
    }
}