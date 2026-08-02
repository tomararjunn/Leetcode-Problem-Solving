class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int x:nums){
            totalsum+=x;
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}