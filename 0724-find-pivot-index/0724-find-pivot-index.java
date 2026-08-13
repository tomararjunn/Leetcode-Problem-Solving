class Solution {
    public int pivotIndex(int[] nums) {
        //first cal total sum
        int totalsum=0;
        for(int x:nums){
            totalsum+=x;
        }


        // Calculate left and right sum
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum){

                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}