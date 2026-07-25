class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){  // apn ne loop chalayi 
            for(int j=i+1;j<n;j++){ //usse agle k liye chalayi 
                int left=j+1; //pointr use kre to reduce complexity 
                int right=n-1;
                while(left<right){
                    long sum=(long) nums[i]+ nums[j] + nums[left]+nums[right]; //sum m dd krliya sbko
                    if(sum==target){ //check kra agr theek h toh l++ r-- krte rho
                        set.add(Arrays.asList(nums[i],nums[j], nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(set);  // lasr m return krdo
    }
}