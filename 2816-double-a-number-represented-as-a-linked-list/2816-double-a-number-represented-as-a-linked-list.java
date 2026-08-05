
class Solution {
    public ListNode reverseLL(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        if(head==null) return null;
        ListNode revHead = reverseLL(head);
        ListNode temp = revHead;
        int carry=0;
        while(temp!=null){
            int sum = temp.val*2 +carry;
            temp.val = sum%10;
            carry = sum/10;
        
        if(temp.next==null){
            if(carry>0){
            temp.next= new ListNode(carry);
            }
            break;
        }
        temp=temp.next;
        }
        return reverseLL(revHead);
    }
}