
class Solution {
    public int[] nextLargerNodes(ListNode head) {
     ArrayList<Integer> list=new ArrayList<>();
         while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        Stack<Integer> st=new Stack<>();
        int n=list.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && list.get(i)>list.get(st.peek())){
                ans[st.pop()]=list.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}