class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,1); // isse ans m abhi 1 store hojega [1,1,1,1] ? why with 1 becoz with 0 it mul and became 0 only 
        int curr=1;  // yeh prefix prod dekhega ab voh kya hota h ? - prefi prod is like [1,2,3,4 ] toh jaise manlo hum 3 p h toh yeh prfux prod phle walon ka 3 se phle ko muli krdega toh 2 aagya 
        for(int i=1;i<n;i++){
            curr*=nums[i-1];
            ans[i] *= curr;
        }
        curr=1;  // humne yeh curr kyu liya h jaise manlo phle prefix m 1 aata toh uski = right m toh kuh nhi h and in empty product hota h 1 iseliye curr=1
        // sufix prod [1 2 3 4] toh yeh 3 k baad ka dekhega toh isme 4 aagya 4 wa;e k right m kuch nhi h oth 1 hi rhega 
        for(int i=n-2;i>=0;i--){
            curr*=nums[i+1];
            ans[i]*=curr;
        }
        return ans;
    }
}