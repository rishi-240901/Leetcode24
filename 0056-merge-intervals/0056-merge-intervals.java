class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort intervals based on starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        // Add the first interval
        ans.add(intervals[0]);

        // Traverse remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            int[] end = ans.get(ans.size() - 1);

            // If overlapping, merge
            if (intervals[i][0] <= end[1]) {
                end[1] = Math.max(end[1], intervals[i][1]);
            }
            // Otherwise, add a new interval
            else {
                ans.add(intervals[i]);
            }
        }

        // Convert List<int[]> to int[][]
        return ans.toArray(new int[ans.size()][]);
    }
}