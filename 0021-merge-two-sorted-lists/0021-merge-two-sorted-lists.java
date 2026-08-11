class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                k.next=temp1;
                temp1=temp1.next;
            }
            else{
                k.next=temp2;
                temp2=temp2.next;
            }
            k=k.next;
        } 
        if(temp1==null){
            k.next=temp2;
        }
        if(temp2==null){
            k.next=temp1;
        }
        return dummy.next;
    }
}