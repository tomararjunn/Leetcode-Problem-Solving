class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int left=0;
        int prod=1;
        int count=0;

        for(int j=0;j<nums.length;j++){
            prod=prod*nums[j];
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            count+=j-left+1;
        }
        return count;
    }
    
}