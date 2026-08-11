class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftmax = 0;   // Highest wall seen from left
        int rightmax = 0;  // Highest wall seen from right
        int water = 0;     // Total trapped water

        while (left < right) {

            // Process the shorter side
            if (height[left] < height[right]) {

                // New highest left wall
                if (height[left] >= leftmax) {
                    leftmax = height[left];
                } 
                else {
                    // Water = left wall - current height
                    water += leftmax - height[left];
                }

                left++;

            } else {

                // New highest right wall
                if (height[right] >= rightmax) {
                    rightmax = height[right];
                } 
                else {
                    // Water = right wall - current height
                    water += rightmax - height[right];
                }

                right--;
            }
        }

        return water;
    }
}