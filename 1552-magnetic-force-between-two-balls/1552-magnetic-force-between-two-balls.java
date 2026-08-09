class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int low = 1;
        int high = position[position.length - 1] - position[0];
        int ans = 0;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            // Count balls we can place
            int balls = 1;
            int lastPosition = position[0];

            for (int i = 1; i < position.length; i++) {

                if (position[i] - lastPosition >= mid) {
                    balls++;
                    lastPosition = position[i];
                }
            }

            // Decide direction
            if (balls >= m) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}