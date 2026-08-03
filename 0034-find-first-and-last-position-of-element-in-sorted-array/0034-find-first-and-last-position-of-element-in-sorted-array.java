class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums,target);
        int last = lastOccurence(nums,target);
        return new int[]{first,last};
    }
    public int firstOccurence(int[] nums,int target){
        int st=0;
        int end =nums.length-1;
        int ans=-1;
        while(st<=end){
            int mid = st+(end-st)/2;  // mid = 0+5/2=2 ok
            if(nums[mid]==target){ //nums[mid][2]=7 no
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){ //7<8 yes
                st=mid+1; // st=mid=2 2+1 =3
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
     public int lastOccurence(int[] nums,int target){
        int st=0;
        int end =nums.length-1;
        int ans=-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]==target){
                ans=mid;
                st=mid+1;
            }
            else if(nums[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}