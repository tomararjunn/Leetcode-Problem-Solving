class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //sum fun
            sum=sum+nums[i];
            //max compare
            maxi=Math.max(maxi,sum);
            //negative sum=0;
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}