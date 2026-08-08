class Solution {
    public int dominantIndex(int[] nums) {
        int m=-1;
        int index=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>m){
                m=nums[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i==index){
                continue;
            }
            if(2*nums[i]>m){
                return -1;
            }
        }
        return index;
    }
}