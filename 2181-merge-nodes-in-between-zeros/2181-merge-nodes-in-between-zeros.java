
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy= new ListNode(-1);
        ListNode tail=dummy;
        ListNode temp=head.next;
        int sum=0;
      
        while(temp!=null){
        if(temp.val!=0){
            sum+=temp.val;
           
        }
        else{
            ListNode curr = new ListNode(sum);
            tail.next = curr;
            tail = curr;    
            sum=0;
        }
        temp=temp.next;
        }
        return dummy.next;
    }
}