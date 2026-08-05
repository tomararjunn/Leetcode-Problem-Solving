class Solution {
    public int[] searchRange(int[] nums, int target) {

        int low = 0;
        int n = nums.length;
        int high = n - 1;

        // Lower Bound
        while (low <= high) {
            int mid=(low+high)/2;

            if (nums[mid] >= target) {
                n = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (n == nums.length || nums[n] != target)
            return new int[]{-1, -1};

        low = 0;
        high = nums.length - 1;
        int last = nums.length;

        // Upper Bound
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                last = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{n, last - 1};
    }
}