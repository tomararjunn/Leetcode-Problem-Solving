class Solution {
    public int trap(int[] height) {

        //declare
        int left=0;
        int right=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        
        //while loop with condition
        while(left<right){
            // Process the shorter side

            if(height[left]<height[right]){
    
                // New highest left wall
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                    // Water = left wall - current height
                    water+=leftmax-height[left];
                }

                left++;
            }
            else{
                // New highest right wall
                if(height[right]>=rightmax){
                    rightmax=height[right];

                }
                else{
                    // Water = right wall - current height
                    water+=rightmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}