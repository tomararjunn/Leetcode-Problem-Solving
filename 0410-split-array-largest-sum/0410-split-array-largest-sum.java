class Solution {
    public int splitArray(int[] nums, int k) {

        int low = 0;
        int sum = 0;

        // Find largest element and total sum
        for (int x : nums) {
            low = Math.max(low, x);
            sum += x;
        }

        int high = sum;
        int ans = high;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            // Count subarrays
            int parts = 1;
            int currSum = 0;

            for (int s : nums) {
                if (currSum + s > mid) {
                    parts++;
                    currSum = s;
                } else {
                    currSum += s;
                }
            }

            // Decide direction
            if (parts <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}