class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                
                HashSet<Long> Hs = new HashSet<>();
                
                for (int k = j + 1; k < n; k++) {
                   
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[k];
                    
                
                    long fourth = (long) target - sum;
                    
                    if (Hs.contains(fourth)) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], (int) fourth, nums[k]);
                        set.add(temp);
                    }
                    Hs.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}