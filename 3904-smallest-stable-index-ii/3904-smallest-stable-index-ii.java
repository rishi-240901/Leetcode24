class Solution {
    public int firstStableIndex(int[] nums, int k) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[nums.length-1]);
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
            list1.add(max);
        }
        int min = nums[nums.length - 1];
        for(int i = nums.length - 2 ; i >= 0 ; i--) {
            if(nums[i] < min) {
                min = nums[i];
            }
            list2.add(min);
        }
        Collections.reverse(list2);
        for(int i = 0 ; i < nums.length ; i++) {
            if(list1.get(i) - list2.get(i) <= k) {
                return i;
            }
        }
        return -1;
        
    }
}