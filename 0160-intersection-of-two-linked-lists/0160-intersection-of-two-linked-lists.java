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
        int sizeA = sizeLL(headA);  // isse size pta chl jayega phle ka
        int sizeB = sizeLL(headB);  // isse dusre ka 

        ListNode temp1 = headA;  // aise manlo size1 bdah toh usko badhayenge 
        ListNode temp2 = headB;  // nhi toh size2 ko badhayenge

        int diff = sizeA-sizeB;  // -1
        if(diff>0){  // iska mtlb ll1 bdi thi  
            while(diff>0){   // yh toh chlega nhi 
                temp1= temp1.next;
                diff--;
            }
        }
        else{
            while(diff<0){  // toh yeh chalega 
                temp2 = temp2.next;  // toh temp2 badhega
                diff++;  //0 hogya 
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}